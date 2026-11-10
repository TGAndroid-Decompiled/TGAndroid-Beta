package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class na1 extends cb1 {
    public final TwoStepVerificationActivity f48168k0;

    public na1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f48168k0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f48168k0.N = true;
    }
}
