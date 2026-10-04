package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mg1 extends bh1 {
    public final TwoStepVerificationActivity f38599k0;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f38599k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f38599k0.N = true;
    }
}
