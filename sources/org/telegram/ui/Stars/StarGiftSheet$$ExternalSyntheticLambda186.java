package org.telegram.ui.Stars;

import org.telegram.tgnet.TLRPC;

public final class StarGiftSheet$$ExternalSyntheticLambda186 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TLRPC.TL_payments_paymentResult f$1;

    public StarGiftSheet$$ExternalSyntheticLambda186(StarGiftSheet starGiftSheet, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$doUpgrade$131(this.f$1);
                break;
            default:
                this.f$0.lambda$doTransfer$161(this.f$1);
                break;
        }
    }
}
