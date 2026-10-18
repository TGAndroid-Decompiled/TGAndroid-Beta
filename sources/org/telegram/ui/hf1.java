package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hf1 extends xf1 {
    public final TwoStepVerificationActivity f37556k0;

    public hf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f37556k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f37556k0.N = true;
    }
}
