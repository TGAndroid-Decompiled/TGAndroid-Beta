package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class gg1 extends wg1 {
    public final TwoStepVerificationActivity f34449h0;

    public gg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f34449h0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f34449h0.K = true;
    }
}
