package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ma1 extends bb1 {
    public final TwoStepVerificationActivity f49835l0;

    public ma1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f49835l0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f49835l0.O = true;
    }
}
