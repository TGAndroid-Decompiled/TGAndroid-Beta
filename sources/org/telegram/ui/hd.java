package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements oa1 {
    public final int f48342a;
    public final xd f48343b;
    public final TwoStepVerificationActivity f48344c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48342a = i7;
        this.f48343b = xdVar;
        this.f48344c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48342a) {
            case 0:
                this.f48343b.F(false, tL_inputCheckPasswordSRP, this.f48344c);
                return;
            case 1:
                this.f48343b.F(true, tL_inputCheckPasswordSRP, this.f48344c);
                return;
            default:
                this.f48343b.F(true, tL_inputCheckPasswordSRP, this.f48344c);
                return;
        }
    }
}
