package org.telegram.ui;

public final class PaymentFormActivity$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final PaymentFormActivity f$0;

    public PaymentFormActivity$$ExternalSyntheticLambda19(PaymentFormActivity paymentFormActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = paymentFormActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onTransitionAnimationEnd$38();
                break;
            case 1:
                this.f$0.lambda$goToNextStep$40();
                break;
            case 2:
                this.f$0.goToNextStep();
                break;
            default:
                this.f$0.lambda$loadPasswordInfo$33();
                break;
        }
    }
}
