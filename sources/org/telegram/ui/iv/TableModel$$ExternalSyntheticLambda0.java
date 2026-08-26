package org.telegram.ui.iv;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.StoriesController;

public final class TableModel$$ExternalSyntheticLambda0 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;

    public TableModel$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        boolean zIsService;
        boolean zIsService2;
        ?? r1;
        boolean z;
        ?? r0;
        switch (this.$r8$classId) {
            case 0:
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                TableModel tableModel = (TableModel) this.f$0;
                int iAnchorRowOf = tableModel.anchorRowOf(pagetablecell);
                int iAnchorRowOf2 = tableModel.anchorRowOf(pagetablecell2);
                return iAnchorRowOf != iAnchorRowOf2 ? Integer.compare(iAnchorRowOf, iAnchorRowOf2) : Integer.compare(tableModel.anchorColOf(pagetablecell), tableModel.anchorColOf(pagetablecell2));
            case 1:
                MediaCodecUtil.ScoreProvider scoreProvider = (MediaCodecUtil.ScoreProvider) this.f$0;
                return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
            case 2:
                Spanned spanned = (Spanned) this.f$0;
                return spanned.getSpanStart((CodeHighlighting.Span) obj2) - spanned.getSpanStart((CodeHighlighting.Span) obj);
            case 3:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.f$0;
                return spannableStringBuilder.getSpanStart((TextSelectionHelper.ReplaceCopyTextSpannable) obj2) - spannableStringBuilder.getSpanStart((TextSelectionHelper.ReplaceCopyTextSpannable) obj);
            case 4:
                return ((Collator) this.f$0).compare((String) obj, (String) obj2);
            case 5:
                StarGiftSheet.CraftTopView.Cube3D cube3D = (StarGiftSheet.CraftTopView.Cube3D) this.f$0;
                cube3D.getClass();
                int iIntValue = ((Integer) obj).intValue();
                float[] fArr = cube3D.faceDepths;
                return Float.compare(fArr[iIntValue], fArr[((Integer) obj2).intValue()]);
            case 6:
                ((LiveCommentsView) this.f$0).getClass();
                return ((LiveCommentsView.TopSender) obj2).lastSentDate - ((LiveCommentsView.TopSender) obj).lastSentDate;
            default:
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean zHasUploadingStories = storiesController.hasUploadingStories(peerDialogId);
                boolean zHasUploadingStories2 = storiesController.hasUploadingStories(peerDialogId2);
                boolean zHasUnreadStories = storiesController.hasUnreadStories(peerDialogId);
                boolean zHasUnreadStories2 = storiesController.hasUnreadStories(peerDialogId2);
                boolean zHasLiveStory = storiesController.hasLiveStory(peerDialogId);
                boolean zHasLiveStory2 = storiesController.hasLiveStory(peerDialogId2);
                ?? r5 = zHasUploadingStories;
                ?? r6 = zHasUploadingStories2;
                if (zHasLiveStory != zHasLiveStory2) {
                    return (zHasLiveStory2 ? 1 : 0) - (zHasLiveStory ? 1 : 0);
                }
                if (zHasUploadingStories == zHasUploadingStories2) {
                    if (zHasUnreadStories != zHasUnreadStories2) {
                        return (zHasUnreadStories2 ? 1 : 0) - (zHasUnreadStories ? 1 : 0);
                    }
                    zIsService = UserObject.isService(peerDialogId);
                    zIsService2 = UserObject.isService(peerDialogId2);
                    if (zIsService == zIsService2) {
                        int i = storiesController.currentAccount;
                        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId));
                        if (user == null) {
                            r5 = zIsService;
                            r6 = zIsService2;
                            r1 = 0;
                        } else {
                            r5 = zIsService;
                            r6 = zIsService2;
                            r1 = user.premium;
                        }
                        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId2));
                        if (user2 == null) {
                            r0 = 0;
                        } else {
                            z = user2.premium;
                        }
                        if (r1 != r0) {
                            r0 = z;
                            return r0 - r1;
                        }
                        r0 = z;
                        return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) zzin.m(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) zzin.m(1, peerStories.stories)).date);
                    }
                }
                r5 = zIsService;
                r6 = zIsService2;
                return r6 - r5;
        }
    }
}
