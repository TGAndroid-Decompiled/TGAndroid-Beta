package org.telegram.ui;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.web.AddressBarList;

public final class OAuthSheet$$ExternalSyntheticLambda3 implements Comparator {
    public final int $r8$classId;

    public OAuthSheet$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                long j = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j2 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j > j2) {
                    return 1;
                }
                return j < j2 ? -1 : 0;
            case 1:
                long j3 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j4 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j3 > j4) {
                    return 1;
                }
                return j3 < j4 ? -1 : 0;
            case 2:
                return ((String) obj).compareTo((String) obj2);
            case 3:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 4:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 5:
                long j5 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j6 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j5 > j6) {
                    return 1;
                }
                return j5 < j6 ? -1 : 0;
            case 6:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 7:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 8:
                return (int) (((StarsReactionsSheet.SenderData) obj2).stars - ((StarsReactionsSheet.SenderData) obj).stars);
            case 9:
                long j7 = ((CacheModel.FileInfo) obj2).size;
                long j8 = ((CacheModel.FileInfo) obj).size;
                if (j7 > j8) {
                    return 1;
                }
                return j7 < j8 ? -1 : 0;
            case 10:
                return ((DialogStoriesCell.StoryCell) obj2).position - ((DialogStoriesCell.StoryCell) obj).position;
            case 11:
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            case 12:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 13:
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            case 14:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 15:
                return (int) (((ProfileStoriesView.StoryCircle) obj2).cachedIndex - ((ProfileStoriesView.StoryCircle) obj).cachedIndex);
            case 16:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 17:
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) obj2;
                String str = ((ReactionsLayoutInBubble.VisibleReaction) obj).emojicon;
                int i = 0;
                int i2 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = visibleReaction.emojicon;
                if (str2 != null && str2.equals("❤")) {
                    i = -1;
                }
                return i2 - i;
            case 18:
                return (int) (((TimelineView.Track) obj2).duration - ((TimelineView.Track) obj).duration);
            case 19:
                return Integer.compare(((Theme.ThemeInfo) obj).sortIndex, ((Theme.ThemeInfo) obj2).sortIndex);
            case 20:
                long j9 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j10 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j9 > j10) {
                    return 1;
                }
                return j9 < j10 ? -1 : 0;
            case 21:
                long j11 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j12 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 22:
                return ((RecyclerView.ViewHolder) obj2).itemView.getTop() - ((RecyclerView.ViewHolder) obj).itemView.getTop();
            case 23:
                return (int) (((AddressBarList.QueryEntry) obj2).rank - ((AddressBarList.QueryEntry) obj).rank);
            default:
                return (int) (((AddressBarList.QueryEntry) obj2).rank - ((AddressBarList.QueryEntry) obj).rank);
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda3(LiveCommentsView liveCommentsView, int i) {
        this.$r8$classId = i;
    }
}
