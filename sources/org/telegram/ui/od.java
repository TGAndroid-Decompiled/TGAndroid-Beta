package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class od implements mf1 {

    public final int f41063a;

    public final fe f41064b;

    public final TwoStepVerificationActivity f41065c;

    public od(fe feVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41063a = i10;
        this.f41064b = feVar;
        this.f41065c = twoStepVerificationActivity;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41063a) {
            case 0:
                this.f41064b.b0(false, tL_inputCheckPasswordSRP, this.f41065c);
                break;
            case 1:
                this.f41064b.b0(true, tL_inputCheckPasswordSRP, this.f41065c);
                break;
            default:
                this.f41064b.b0(true, tL_inputCheckPasswordSRP, this.f41065c);
                break;
        }
    }
}
