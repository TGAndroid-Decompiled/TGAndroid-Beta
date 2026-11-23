package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements ma1 {
    public final int f48537a;
    public final xd f48538b;
    public final TwoStepVerificationActivity f48539c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48537a = i7;
        this.f48538b = xdVar;
        this.f48539c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f48537a) {
            case 0:
                this.f48538b.F(false, tL_inputCheckPasswordSRP, this.f48539c);
                return;
            case 1:
                this.f48538b.F(true, tL_inputCheckPasswordSRP, this.f48539c);
                return;
            default:
                this.f48538b.F(true, tL_inputCheckPasswordSRP, this.f48539c);
                return;
        }
    }
}
