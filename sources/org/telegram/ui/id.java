package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class id implements la1 {
    public final int f46649a;
    public final zd f46650b;
    public final TwoStepVerificationActivity f46651c;

    public id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46649a = i7;
        this.f46650b = zdVar;
        this.f46651c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46649a) {
            case 0:
                this.f46650b.F(false, tL_inputCheckPasswordSRP, this.f46651c);
                return;
            case 1:
                this.f46650b.F(true, tL_inputCheckPasswordSRP, this.f46651c);
                return;
            default:
                this.f46650b.F(true, tL_inputCheckPasswordSRP, this.f46651c);
                return;
        }
    }
}
