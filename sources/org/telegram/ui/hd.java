package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements ka1 {
    public final int f47682a;
    public final xd f47683b;
    public final TwoStepVerificationActivity f47684c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f47682a = i7;
        this.f47683b = xdVar;
        this.f47684c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f47682a) {
            case 0:
                this.f47683b.F(false, tL_inputCheckPasswordSRP, this.f47684c);
                return;
            case 1:
                this.f47683b.F(true, tL_inputCheckPasswordSRP, this.f47684c);
                return;
            default:
                this.f47683b.F(true, tL_inputCheckPasswordSRP, this.f47684c);
                return;
        }
    }
}
