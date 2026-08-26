package org.telegram.ui.Stars;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class StarsController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final StarsController f$0;
    public final TLRPC.TL_payments_paymentResult f$1;

    public StarsController$$ExternalSyntheticLambda6(StarsController starsController, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i) {
        this.$r8$classId = i;
        this.f$0 = starsController;
        this.f$1 = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(this.f$1.updates, false);
                break;
            case 1:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(this.f$1.updates, false);
                break;
            case 2:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(this.f$1.updates, false);
                break;
            case 3:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(this.f$1.updates, false);
                break;
            default:
                MessagesController.getInstance(this.f$0.currentAccount).processUpdates(this.f$1.updates, false);
                break;
        }
    }
}
