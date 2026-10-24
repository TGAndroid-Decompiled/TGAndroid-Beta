package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class lf1 extends ag1 {
    public final TwoStepVerificationActivity f39259k0;

    public lf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f39259k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f39259k0.N = true;
    }
}
