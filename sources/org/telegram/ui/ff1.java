package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ff1 extends vf1 {
    public final TwoStepVerificationActivity f36985k0;

    public ff1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f36985k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f36985k0.N = true;
    }
}
