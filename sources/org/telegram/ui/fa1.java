package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fa1 implements org.telegram.ui.ActionBar.r1 {
    public final int f45676a;
    public final TwoStepVerificationActivity f45677b;

    public fa1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45676a = i7;
        this.f45677b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45676a) {
            case 0:
                this.f45677b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45677b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ga1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f45677b.p0();
                return;
            case 3:
                this.f45677b.z0();
                return;
            default:
                this.f45677b.z0();
                return;
        }
    }
}
