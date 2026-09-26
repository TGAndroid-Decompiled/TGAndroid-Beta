package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class kg1 extends zg1 {
    public final TwoStepVerificationActivity f35059k0;

    public kg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f35059k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f35059k0.N = true;
    }
}
