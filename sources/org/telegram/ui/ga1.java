package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ga1 implements org.telegram.ui.ActionBar.r1 {
    public final int f46058a;
    public final TwoStepVerificationActivity f46059b;

    public ga1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46058a = i7;
        this.f46059b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f46058a) {
            case 0:
                this.f46059b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f46059b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ha1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f46059b.p0();
                return;
            case 3:
                this.f46059b.z0();
                return;
            default:
                this.f46059b.z0();
                return;
        }
    }
}
