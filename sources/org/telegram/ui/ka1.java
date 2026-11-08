package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ka1 extends za1 {
    public final TwoStepVerificationActivity f47155k0;

    public ka1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f47155k0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f47155k0.N = true;
    }
}
