package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class PaymentFormActivity$$ExternalSyntheticLambda29 implements RequestDelegate {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda29(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                PaymentFormActivity paymentFormActivity = this.f$0;
                paymentFormActivity.getClass();
                AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda36(paymentFormActivity, tL_error, tLObject, 0));
                break;
            case 1:
                PaymentFormActivity paymentFormActivity2 = this.f$0;
                paymentFormActivity2.getClass();
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(4, paymentFormActivity2, tL_error));
                break;
            case 2:
                PaymentFormActivity paymentFormActivity3 = this.f$0;
                paymentFormActivity3.getClass();
                AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda0(paymentFormActivity3, tLObject, 2));
                break;
            default:
                PaymentFormActivity paymentFormActivity4 = this.f$0;
                paymentFormActivity4.getClass();
                AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda0(paymentFormActivity4, tLObject, 0));
                break;
        }
    }
}
