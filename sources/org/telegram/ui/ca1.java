package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ca1 implements org.telegram.ui.ActionBar.r1 {
    public final int f44712a;
    public final TwoStepVerificationActivity f44713b;

    public ca1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f44712a = i7;
        this.f44713b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44712a) {
            case 0:
                this.f44713b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f44713b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new da1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f44713b.p0();
                return;
            case 3:
                this.f44713b.z0();
                return;
            default:
                this.f44713b.z0();
                return;
        }
    }
}
