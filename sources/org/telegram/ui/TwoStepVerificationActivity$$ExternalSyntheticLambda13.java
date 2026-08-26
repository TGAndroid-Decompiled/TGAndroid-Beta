package org.telegram.ui;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda13(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0();
                break;
            case 1:
                this.f$0.updateBottomButton();
                break;
            case 2:
                this.f$0.lambda$onFieldError$36();
                break;
            default:
                this.f$0.lambda$updateRows$20();
                break;
        }
    }
}
