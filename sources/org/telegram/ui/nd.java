package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nd implements pf1 {
    public final int f40779a;
    public final de f40780b;
    public final TwoStepVerificationActivity f40781c;

    public nd(de deVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40779a = i10;
        this.f40780b = deVar;
        this.f40781c = twoStepVerificationActivity;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f40779a) {
            case 0:
                this.f40780b.b0(false, tL_inputCheckPasswordSRP, this.f40781c);
                return;
            case 1:
                this.f40780b.b0(true, tL_inputCheckPasswordSRP, this.f40781c);
                return;
            default:
                this.f40780b.b0(true, tL_inputCheckPasswordSRP, this.f40781c);
                return;
        }
    }
}
