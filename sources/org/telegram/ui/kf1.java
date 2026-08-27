package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

public final class kf1 extends zf1 {

    public final TwoStepVerificationActivity f39714g0;

    public kf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f39714g0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f39714g0.J = true;
    }
}
