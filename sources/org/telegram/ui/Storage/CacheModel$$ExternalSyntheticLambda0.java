package org.telegram.ui.Storage;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.AddressBarList;

public final class CacheModel$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;

    public CacheModel$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j;
        switch (this.$r8$classId) {
            case 0:
                long j2 = ((CacheModel.FileInfo) obj2).size;
                long j3 = ((CacheModel.FileInfo) obj).size;
                if (j2 > j3) {
                    return 1;
                }
                return j2 < j3 ? -1 : 0;
            case 1:
                return ((QuickRepliesController.QuickReply) obj).order - ((QuickRepliesController.QuickReply) obj2).order;
            case 2:
                return ChatMessageCell.lambda$normalizePollPercents$16((ChatMessageCell.PollButton) obj, (ChatMessageCell.PollButton) obj2);
            case 3:
                return (int) ((((PremiumStickersPreviewRecycler.StickerView) obj).progress * 100.0f) - (((PremiumStickersPreviewRecycler.StickerView) obj2).progress * 100.0f));
            case 4:
                return ((String) obj).compareTo((String) obj2);
            case 5:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                long j4 = 0;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else {
                    j = tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).id : 0L;
                }
                if (tLObject2 instanceof TLRPC.User) {
                    j4 = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    j4 = ((TLRPC.Chat) tLObject2).id;
                }
                return (int) (j - j4);
            case 6:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 7:
                return ((TL_stars.SavedStarGift) obj2).date - ((TL_stars.SavedStarGift) obj).date;
            case 8:
                return (int) (((StarsReactionsSheet.SenderData) obj2).stars - ((StarsReactionsSheet.SenderData) obj).stars);
            case 9:
                return DialogStoriesCell.lambda$new$6((DialogStoriesCell.StoryCell) obj, (DialogStoriesCell.StoryCell) obj2);
            case 10:
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            case 11:
                return (int) (((TL_phone.groupCallDonor) obj2).stars - ((TL_phone.groupCallDonor) obj).stars);
            case 12:
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            case 13:
                return ((Integer) ((Pair) obj).first).intValue() - ((Integer) ((Pair) obj2).first).intValue();
            case 14:
                return ProfileStoriesView.lambda$dispatchDraw$2((ProfileStoriesView.StoryCircle) obj, (ProfileStoriesView.StoryCircle) obj2);
            case 15:
                return (int) (((Long) obj2).longValue() - ((Long) obj).longValue());
            case 16:
                ReactionsLayoutInBubble.VisibleReaction visibleReaction = (ReactionsLayoutInBubble.VisibleReaction) obj2;
                String str = ((ReactionsLayoutInBubble.VisibleReaction) obj).emojicon;
                int i = 0;
                int i2 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = visibleReaction.emojicon;
                if (str2 != null && str2.equals("❤")) {
                    i = -1;
                }
                return i2 - i;
            case 17:
                return (int) (((TimelineView.Track) obj2).duration - ((TimelineView.Track) obj).duration);
            case 18:
                return ChatListItemAnimator.lambda$runAlphaEnterTransition$1((RecyclerView.ViewHolder) obj, (RecyclerView.ViewHolder) obj2);
            case 19:
                return (int) (((AddressBarList.QueryEntry) obj2).rank - ((AddressBarList.QueryEntry) obj).rank);
            default:
                return (int) (((AddressBarList.QueryEntry) obj2).rank - ((AddressBarList.QueryEntry) obj).rank);
        }
    }

    public CacheModel$$ExternalSyntheticLambda0(LiveCommentsView liveCommentsView, int i) {
        this.$r8$classId = i;
    }
}
