package org.telegram.ui;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;
    public final byte[] f$1;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda19(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, byte[] bArr, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = bArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processNext$28(this.f$1);
                break;
            default:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                twoStepVerificationSetupActivity.needHideProgress();
                twoStepVerificationSetupActivity.currentPasswordHash = this.f$1;
                twoStepVerificationSetupActivity.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(9, twoStepVerificationSetupActivity.currentPassword);
                twoStepVerificationSetupActivity2.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
                twoStepVerificationSetupActivity2.otherwiseReloginDays = twoStepVerificationSetupActivity.otherwiseReloginDays;
                twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity2, true);
                break;
        }
    }
}
