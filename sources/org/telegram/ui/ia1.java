package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ia1 extends xa1 {
    public final TwoStepVerificationActivity f47999l0;

    public ia1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f47999l0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f47999l0.O = true;
    }
}
