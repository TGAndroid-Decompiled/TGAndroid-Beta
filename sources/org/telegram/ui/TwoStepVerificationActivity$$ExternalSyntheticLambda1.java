package org.telegram.ui;

import org.telegram.tgnet.TLObject;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;
    public final TLObject f$1;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda1(TwoStepVerificationActivity twoStepVerificationActivity, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
        this.f$1 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resetPassword$12(this.f$1);
                break;
            default:
                this.f$0.lambda$cancelPasswordReset$8(this.f$1);
                break;
        }
    }
}
