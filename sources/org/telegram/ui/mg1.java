package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35753a;
    public final TwoStepVerificationActivity f35754b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35753a = i10;
        this.f35754b = twoStepVerificationActivity;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35753a) {
            case 0:
                this.f35754b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35754b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ng1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35754b.k0();
                return;
            case 3:
                this.f35754b.u0();
                return;
            default:
                this.f35754b.u0();
                return;
        }
    }
}
