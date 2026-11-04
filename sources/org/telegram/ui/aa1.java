package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class aa1 extends ra1 {
    public final TwoStepVerificationActivity f43700l0;

    public aa1(TwoStepVerificationActivity twoStepVerificationActivity, int i3, TL_account.Password password) {
        super(i3, 4, password);
        this.f43700l0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f43700l0.O = true;
    }
}
