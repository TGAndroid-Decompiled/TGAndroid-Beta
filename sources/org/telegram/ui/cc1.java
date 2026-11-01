package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class cc1 extends rc1 {
    public final TwoStepVerificationActivity f36290k0;

    public cc1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f36290k0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f36290k0.N = true;
    }
}
