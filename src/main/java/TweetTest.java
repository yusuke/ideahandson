import twitter4j.*;

/**
 * Created by yusuke on 7/2/14.
 */
public class TweetTest {
    public static void main(String[] args) throws TwitterException {
        Twitter singleton = TwitterFactory.getSingleton();
        ResponseList<Status> homeTimeline = singleton.getHomeTimeline();

        for (Status status : homeTimeline) {
            System.out.println(status.getText());

        }

    }
}
