package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements oa1 {
    public final int f48299a;
    public final xd f48300b;
    public final TwoStepVerificationActivity f48301c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48299a = i7;
        this.f48300b = xdVar;
        this.f48301c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48299a) {
            case 0:
                this.f48300b.F(false, tL_inputCheckPasswordSRP, this.f48301c);
                return;
            case 1:
                this.f48300b.F(true, tL_inputCheckPasswordSRP, this.f48301c);
                return;
            default:
                this.f48300b.F(true, tL_inputCheckPasswordSRP, this.f48301c);
                return;
        }
    }
}
