package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements oa1 {
    public final int f48373a;
    public final xd f48374b;
    public final TwoStepVerificationActivity f48375c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48373a = i7;
        this.f48374b = xdVar;
        this.f48375c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48373a) {
            case 0:
                this.f48374b.F(false, tL_inputCheckPasswordSRP, this.f48375c);
                return;
            case 1:
                this.f48374b.F(true, tL_inputCheckPasswordSRP, this.f48375c);
                return;
            default:
                this.f48374b.F(true, tL_inputCheckPasswordSRP, this.f48375c);
                return;
        }
    }
}
