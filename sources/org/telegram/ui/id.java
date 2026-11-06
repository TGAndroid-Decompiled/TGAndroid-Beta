package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class id implements la1 {
    public final int f46641a;
    public final zd f46642b;
    public final TwoStepVerificationActivity f46643c;

    public id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46641a = i7;
        this.f46642b = zdVar;
        this.f46643c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46641a) {
            case 0:
                this.f46642b.F(false, tL_inputCheckPasswordSRP, this.f46643c);
                return;
            case 1:
                this.f46642b.F(true, tL_inputCheckPasswordSRP, this.f46643c);
                return;
            default:
                this.f46642b.F(true, tL_inputCheckPasswordSRP, this.f46643c);
                return;
        }
    }
}
