package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ag1 extends qg1 {
    public final TwoStepVerificationActivity f35170h0;

    public ag1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f35170h0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f35170h0.K = true;
    }
}
