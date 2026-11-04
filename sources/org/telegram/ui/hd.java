package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hd implements ca1 {
    public final int f45902a;
    public final xd f45903b;
    public final TwoStepVerificationActivity f45904c;

    public hd(xd xdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f45902a = i3;
        this.f45903b = xdVar;
        this.f45904c = twoStepVerificationActivity;
    }

    @Override
    public final void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f45902a) {
            case 0:
                this.f45903b.F(false, tL_inputCheckPasswordSRP, this.f45904c);
                return;
            case 1:
                this.f45903b.F(true, tL_inputCheckPasswordSRP, this.f45904c);
                return;
            default:
                this.f45903b.F(true, tL_inputCheckPasswordSRP, this.f45904c);
                return;
        }
    }
}
