package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class lg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f39662a;
    public final TwoStepVerificationActivity f39663b;

    public lg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39662a = i10;
        this.f39663b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39662a) {
            case 0:
                this.f39663b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f39663b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new mg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f39663b.k0();
                return;
            case 3:
                this.f39663b.u0();
                return;
            default:
                this.f39663b.u0();
                return;
        }
    }
}
