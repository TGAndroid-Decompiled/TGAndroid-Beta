package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class id implements ma1 {
    public final int f46652a;
    public final zd f46653b;
    public final TwoStepVerificationActivity f46654c;

    public id(zd zdVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46652a = i7;
        this.f46653b = zdVar;
        this.f46654c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f46652a) {
            case 0:
                this.f46653b.F(false, tL_inputCheckPasswordSRP, this.f46654c);
                return;
            case 1:
                this.f46653b.F(true, tL_inputCheckPasswordSRP, this.f46654c);
                return;
            default:
                this.f46653b.F(true, tL_inputCheckPasswordSRP, this.f46654c);
                return;
        }
    }
}
