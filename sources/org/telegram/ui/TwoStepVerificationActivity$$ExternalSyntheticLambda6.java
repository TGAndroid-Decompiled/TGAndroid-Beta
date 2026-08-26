package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda6(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$clearPassword$22(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$clearPassword$24(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$resetPassword$13(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$processDone$32(tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$cancelPasswordReset$9(tLObject, tL_error);
                break;
            case 5:
                this.f$0.lambda$clearPassword$26(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onPasswordForgot$15(tLObject, tL_error);
                break;
        }
    }
}
