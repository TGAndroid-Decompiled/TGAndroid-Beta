package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14 implements RequestDelegate {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processNext$25(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$setNewPassword$44(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$loadPasswordInfo$42(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$createView$5(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$processNext$35(tLObject, tL_error);
                break;
        }
    }
}
