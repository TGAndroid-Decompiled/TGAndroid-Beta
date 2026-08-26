package org.telegram.ui.Stars;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class StarGiftSheet$$ExternalSyntheticLambda100 implements Utilities.Callback4 {
    public final int $r8$classId;
    public final BottomSheet f$0;
    public final StoryRecorder f$1;
    public final View f$2;

    public StarGiftSheet$$ExternalSyntheticLambda100(BottomSheet bottomSheet, StoryRecorder storyRecorder, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
        this.f$1 = storyRecorder;
        this.f$2 = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Runnable runnable = (Runnable) obj2;
        Boolean bool = (Boolean) obj3;
        Long l = (Long) obj4;
        BottomSheet bottomSheet = this.f$0;
        switch (i) {
            case 0:
                StarGiftSheet starGiftSheet = (StarGiftSheet) bottomSheet;
                starGiftSheet.getClass();
                boolean zBooleanValue = bool.booleanValue();
                StoryRecorder storyRecorder = this.f$1;
                StoryRecorder.SourceView.AnonymousClass1 anonymousClass1FromShareCell = null;
                if (zBooleanValue) {
                    AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(26, starGiftSheet, l));
                    storyRecorder.replaceSourceView(null);
                    StarGiftSheet.AnonymousClass11 anonymousClass11 = starGiftSheet.shareAlert;
                    if (anonymousClass11 != null) {
                        anonymousClass11.lambda$showGiftOfferSheet$15();
                        starGiftSheet.shareAlert = null;
                    }
                } else {
                    View view = this.f$2;
                    if ((view instanceof ShareDialogCell) && view.isAttachedToWindow()) {
                        anonymousClass1FromShareCell = StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view);
                    }
                    storyRecorder.replaceSourceView(anonymousClass1FromShareCell);
                }
                AndroidUtilities.runOnUIThread(runnable);
                break;
            default:
                ChatActivity.ChatMessageCellDelegate.AnonymousClass1 anonymousClass1 = (ChatActivity.ChatMessageCellDelegate.AnonymousClass1) bottomSheet;
                anonymousClass1.getClass();
                boolean zBooleanValue2 = bool.booleanValue();
                StoryRecorder storyRecorder2 = this.f$1;
                StoryRecorder.SourceView.AnonymousClass1 anonymousClass1FromShareCell2 = null;
                if (zBooleanValue2) {
                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(3, anonymousClass1, l));
                    anonymousClass1.lambda$showGiftOfferSheet$15();
                    storyRecorder2.replaceSourceView(null);
                } else {
                    View view2 = this.f$2;
                    if ((view2 instanceof ShareDialogCell) && view2.isAttachedToWindow()) {
                        anonymousClass1FromShareCell2 = StoryRecorder.SourceView.fromShareCell((ShareDialogCell) view2);
                    }
                    storyRecorder2.replaceSourceView(anonymousClass1FromShareCell2);
                }
                AndroidUtilities.runOnUIThread(runnable);
                break;
        }
    }
}
