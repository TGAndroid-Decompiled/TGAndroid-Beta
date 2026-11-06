package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class id implements la1 {
    public final int f46650a;
    public final zd f46651b;
    public final TwoStepVerificationActivity f46652c;

    public id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46650a = i7;
        this.f46651b = zdVar;
        this.f46652c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46650a) {
            case 0:
                this.f46651b.F(false, tL_inputCheckPasswordSRP, this.f46652c);
                return;
            case 1:
                this.f46651b.F(true, tL_inputCheckPasswordSRP, this.f46652c);
                return;
            default:
                this.f46651b.F(true, tL_inputCheckPasswordSRP, this.f46652c);
                return;
        }
    }
}
