package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements oa1 {
    public final int f48379a;
    public final xd f48380b;
    public final TwoStepVerificationActivity f48381c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48379a = i7;
        this.f48380b = xdVar;
        this.f48381c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48379a) {
            case 0:
                this.f48380b.F(false, tL_inputCheckPasswordSRP, this.f48381c);
                return;
            case 1:
                this.f48380b.F(true, tL_inputCheckPasswordSRP, this.f48381c);
                return;
            default:
                this.f48380b.F(true, tL_inputCheckPasswordSRP, this.f48381c);
                return;
        }
    }
}
