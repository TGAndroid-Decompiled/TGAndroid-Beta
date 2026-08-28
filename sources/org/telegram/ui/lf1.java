package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class lf1 extends ag1 {
    public final TwoStepVerificationActivity f40129g0;

    public lf1(TwoStepVerificationActivity twoStepVerificationActivity, int i9, TL_account.Password password) {
        super(i9, 4, password);
        this.f40129g0 = twoStepVerificationActivity;
    }

    @Override
    public final void A0() {
        this.f40129g0.J = true;
    }
}
