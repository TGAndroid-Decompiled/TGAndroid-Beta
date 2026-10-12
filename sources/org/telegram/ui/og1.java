package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class og1 implements org.telegram.ui.ActionBar.z1 {
    public final int f40715a;
    public final TwoStepVerificationActivity f40716b;

    public og1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40715a = i10;
        this.f40716b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40715a) {
            case 0:
                this.f40716b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40716b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new pg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40716b.k0();
                return;
            case 3:
                this.f40716b.u0();
                return;
            default:
                this.f40716b.u0();
                return;
        }
    }
}
