package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class PaymentFormActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;
    public final TLObject f$1;

    public PaymentFormActivity$$ExternalSyntheticLambda13(PaymentFormActivity paymentFormActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendData$67(this.f$1);
                break;
            case 1:
                this.f$0.lambda$sendData$57(this.f$1);
                break;
            default:
                this.f$0.lambda$sendData$62(this.f$1);
                break;
        }
    }
}
