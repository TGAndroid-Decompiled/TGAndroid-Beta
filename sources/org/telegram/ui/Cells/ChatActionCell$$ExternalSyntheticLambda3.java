package org.telegram.ui.Cells;

import java.util.ArrayList;

public final class ChatActionCell$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChatActionCell f$0;

    public ChatActionCell$$ExternalSyntheticLambda3(ChatActionCell chatActionCell, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActionCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateOutbounds();
                break;
            case 1:
                ChatActionCell chatActionCell = this.f$0;
                ChatActionCell.ChatActionCellDelegate chatActionCellDelegate = chatActionCell.delegate;
                if (chatActionCellDelegate != null) {
                    chatActionCellDelegate.onTopicClick(chatActionCell);
                }
                break;
            case 2:
                ChatActionCell chatActionCell2 = this.f$0;
                chatActionCell2.post(new ChatActionCell$$ExternalSyntheticLambda3(chatActionCell2, 4));
                break;
            case 3:
                this.f$0.requestLayout();
                break;
            default:
                ChatActionCell chatActionCell3 = this.f$0;
                chatActionCell3.isSpoilerRevealing = false;
                chatActionCell3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = chatActionCell3.giftPremiumText.spoilers;
                if (arrayList != null) {
                    arrayList.clear();
                }
                chatActionCell3.invalidate();
                break;
        }
    }
}
