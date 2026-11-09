package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class id implements oa1 {
    public final int f46618a;
    public final zd f46619b;
    public final TwoStepVerificationActivity f46620c;

    public id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46618a = i7;
        this.f46619b = zdVar;
        this.f46620c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46618a) {
            case 0:
                this.f46619b.F(false, tL_inputCheckPasswordSRP, this.f46620c);
                return;
            case 1:
                this.f46619b.F(true, tL_inputCheckPasswordSRP, this.f46620c);
                return;
            default:
                this.f46619b.F(true, tL_inputCheckPasswordSRP, this.f46620c);
                return;
        }
    }
}
