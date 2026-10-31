package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ec1 extends tc1 {
    public final TwoStepVerificationActivity f37016k0;

    public ec1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f37016k0 = twoStepVerificationActivity;
    }

    @Override
    public final void F0() {
        this.f37016k0.N = true;
    }
}
