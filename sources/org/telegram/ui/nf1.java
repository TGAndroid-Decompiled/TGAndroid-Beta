package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class nf1 extends cg1 {
    public final TwoStepVerificationActivity f40794g0;

    public nf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f40794g0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f40794g0.J = true;
    }
}
