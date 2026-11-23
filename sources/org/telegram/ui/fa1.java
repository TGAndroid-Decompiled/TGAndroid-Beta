package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fa1 implements org.telegram.ui.ActionBar.q1 {
    public final int f47657a;
    public final TwoStepVerificationActivity f47658b;

    public fa1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f47657a = i7;
        this.f47658b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f47657a) {
            case 0:
                this.f47658b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f47658b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ga1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f47658b.p0();
                return;
            case 3:
                this.f47658b.z0();
                return;
            default:
                this.f47658b.z0();
                return;
        }
    }
}
