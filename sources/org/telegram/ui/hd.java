package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements ka1 {
    public final int f47672a;
    public final xd f47673b;
    public final TwoStepVerificationActivity f47674c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f47672a = i7;
        this.f47673b = xdVar;
        this.f47674c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f47672a) {
            case 0:
                this.f47673b.F(false, tL_inputCheckPasswordSRP, this.f47674c);
                return;
            case 1:
                this.f47673b.F(true, tL_inputCheckPasswordSRP, this.f47674c);
                return;
            default:
                this.f47673b.F(true, tL_inputCheckPasswordSRP, this.f47674c);
                return;
        }
    }
}
