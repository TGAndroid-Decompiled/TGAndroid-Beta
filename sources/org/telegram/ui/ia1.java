package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ia1 extends xa1 {
    public final TwoStepVerificationActivity f48009l0;

    public ia1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f48009l0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f48009l0.O = true;
    }
}
