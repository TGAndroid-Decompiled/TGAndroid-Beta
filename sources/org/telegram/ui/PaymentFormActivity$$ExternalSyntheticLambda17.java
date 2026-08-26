package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PaymentFormActivity$$ExternalSyntheticLambda17 implements RequestDelegate {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda17(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendData$58(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$sendSavePassword$42(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$loadPasswordInfo$35(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$sendData$63(tLObject, tL_error);
                break;
        }
    }
}
