package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class og1 implements org.telegram.ui.ActionBar.z1 {
    public final int f40713a;
    public final TwoStepVerificationActivity f40714b;

    public og1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40713a = i10;
        this.f40714b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40713a) {
            case 0:
                this.f40714b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40714b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new pg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40714b.k0();
                return;
            case 3:
                this.f40714b.u0();
                return;
            default:
                this.f40714b.u0();
                return;
        }
    }
}
