package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mf1 extends bg1 {
    public final TwoStepVerificationActivity f39566k0;

    public mf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f39566k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f39566k0.N = true;
    }
}
