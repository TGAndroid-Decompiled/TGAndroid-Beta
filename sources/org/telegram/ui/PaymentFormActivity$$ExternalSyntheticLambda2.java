package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class PaymentFormActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda2(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PaymentFormActivity paymentFormActivity = this.f$0;
                paymentFormActivity.inputFields[0].requestFocus();
                AndroidUtilities.showKeyboard(paymentFormActivity.inputFields[0]);
                break;
            case 1:
                PaymentFormActivity paymentFormActivity2 = this.f$0;
                paymentFormActivity2.getMessagesController().newMessageCallback = null;
                if (paymentFormActivity2.invoiceStatus == 3 && !paymentFormActivity2.isFinishing()) {
                    paymentFormActivity2.invoiceStatus = 4;
                    PaymentFormActivity.PaymentFormCallback paymentFormCallback = paymentFormActivity2.paymentFormCallback;
                    if (paymentFormCallback != null) {
                        paymentFormCallback.onInvoiceStatusChanged(4);
                    }
                    paymentFormActivity2.finishFragment();
                    break;
                } else if (paymentFormActivity2.invoiceStatus == 1 && !paymentFormActivity2.isFinishing()) {
                    paymentFormActivity2.finishFragment();
                    break;
                }
                break;
            case 2:
                this.f$0.goToNextStep();
                break;
            default:
                PaymentFormActivity paymentFormActivity3 = this.f$0;
                if (paymentFormActivity3.shortPollRunnable != null) {
                    paymentFormActivity3.loadPasswordInfo$1();
                    paymentFormActivity3.shortPollRunnable = null;
                    break;
                }
                break;
        }
    }
}
