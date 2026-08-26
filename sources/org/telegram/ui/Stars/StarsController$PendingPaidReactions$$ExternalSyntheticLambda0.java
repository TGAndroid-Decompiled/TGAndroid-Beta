package org.telegram.ui.Stars;

public final class StarsController$PendingPaidReactions$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StarsController.PendingPaidReactions f$0;
    public final long f$1;

    public StarsController$PendingPaidReactions$$ExternalSyntheticLambda0(StarsController.PendingPaidReactions pendingPaidReactions, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = pendingPaidReactions;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StarsController.PendingPaidReactions pendingPaidReactions = this.f$0;
                Long l = pendingPaidReactions.peer;
                StarsController.this.sendPaidReaction(pendingPaidReactions.messageObject, pendingPaidReactions.chatActivity, this.f$1, true, true, l);
                break;
            default:
                StarsController.PendingPaidReactions pendingPaidReactions2 = this.f$0;
                Long l2 = pendingPaidReactions2.peer;
                StarsController.this.sendPaidReaction(pendingPaidReactions2.messageObject, pendingPaidReactions2.chatActivity, this.f$1, true, true, l2);
                break;
        }
    }
}
