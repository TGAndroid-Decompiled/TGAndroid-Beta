package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class of1 extends dg1 {
    public final TwoStepVerificationActivity f42180k0;

    public of1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f42180k0 = twoStepVerificationActivity;
    }

    @Override
    public final void C0() {
        this.f42180k0.N = true;
    }
}
