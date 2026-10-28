package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class qf1 extends fg1 {
    public final TwoStepVerificationActivity f42703k0;

    public qf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f42703k0 = twoStepVerificationActivity;
    }

    @Override
    public final void C0() {
        this.f42703k0.N = true;
    }
}
