package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;
    public final TLRPC.TL_error f$1;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda0(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setNewPassword$43(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processNext$26(this.f$1);
                break;
            case 2:
                this.f$0.lambda$createView$4(this.f$1);
                break;
            default:
                this.f$0.lambda$processNext$34(this.f$1);
                break;
        }
    }
}
