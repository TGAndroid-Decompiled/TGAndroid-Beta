package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ja1 extends ya1 {
    public final TwoStepVerificationActivity f46915k0;

    public ja1(TwoStepVerificationActivity twoStepVerificationActivity, int i7, TL_account.Password password) {
        super(i7, 4, password);
        this.f46915k0 = twoStepVerificationActivity;
    }

    @Override
    public final void G0() {
        this.f46915k0.N = true;
    }
}
