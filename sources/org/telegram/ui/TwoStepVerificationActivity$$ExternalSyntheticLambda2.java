package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda2(TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$clearPassword$21(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$processDone$31(this.f$1, this.f$2);
                break;
            case 2:
                this.f$0.lambda$onPasswordForgot$14(this.f$1, this.f$2);
                break;
            case 3:
                this.f$0.lambda$clearPassword$23(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$clearPassword$25(this.f$1, this.f$2);
                break;
        }
    }
}
