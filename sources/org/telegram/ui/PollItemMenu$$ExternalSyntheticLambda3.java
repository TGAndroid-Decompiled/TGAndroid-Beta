package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ChatMessageCell;

public final class PollItemMenu$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final PollItemMenu f$0;

    public PollItemMenu$$ExternalSyntheticLambda3(PollItemMenu pollItemMenu, int i) {
        this.$r8$classId = i;
        this.f$0 = pollItemMenu;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PollItemMenu pollItemMenu = this.f$0;
                pollItemMenu.getClass();
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda3(pollItemMenu, 3));
                ChatMessageCell chatMessageCell = pollItemMenu.cell;
                if (chatMessageCell != null) {
                    chatMessageCell.setVisibility(0);
                    ChatMessageCell chatMessageCell2 = pollItemMenu.cell;
                    chatMessageCell2.doNotDrawPollId = null;
                    chatMessageCell2.invalidate();
                }
                ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 = pollItemMenu.dismissListener;
                if (chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8 != null) {
                    AndroidUtilities.runOnUIThread(chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda8);
                    pollItemMenu.dismissListener = null;
                }
                break;
            case 1:
                this.f$0.dismiss(false);
                break;
            case 2:
                this.f$0.dismiss(false);
                break;
            default:
                this.f$0.lambda$dismiss$15();
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda3(PollItemMenu pollItemMenu, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = pollItemMenu;
    }
}
