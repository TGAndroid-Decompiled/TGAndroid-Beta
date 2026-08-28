package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class od implements nf1 {
    public final int f41122a;
    public final fe f41123b;
    public final TwoStepVerificationActivity f41124c;

    public od(fe feVar, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f41122a = i9;
        this.f41123b = feVar;
        this.f41124c = twoStepVerificationActivity;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41122a) {
            case 0:
                this.f41123b.b0(false, tL_inputCheckPasswordSRP, this.f41124c);
                return;
            case 1:
                this.f41123b.b0(true, tL_inputCheckPasswordSRP, this.f41124c);
                return;
            default:
                this.f41123b.b0(true, tL_inputCheckPasswordSRP, this.f41124c);
                return;
        }
    }
}
