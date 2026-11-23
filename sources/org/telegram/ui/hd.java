package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements oa1 {
    public final int f48377a;
    public final xd f48378b;
    public final TwoStepVerificationActivity f48379c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48377a = i7;
        this.f48378b = xdVar;
        this.f48379c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48377a) {
            case 0:
                this.f48378b.F(false, tL_inputCheckPasswordSRP, this.f48379c);
                return;
            case 1:
                this.f48378b.F(true, tL_inputCheckPasswordSRP, this.f48379c);
                return;
            default:
                this.f48378b.F(true, tL_inputCheckPasswordSRP, this.f48379c);
                return;
        }
    }
}
