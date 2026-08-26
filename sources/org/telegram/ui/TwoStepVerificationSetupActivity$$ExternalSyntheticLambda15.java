package org.telegram.ui;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;
    public final byte[] f$1;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda15(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, byte[] bArr, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = bArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processNext$23(this.f$1);
                break;
            default:
                this.f$0.lambda$processNext$28(this.f$1);
                break;
        }
    }
}
