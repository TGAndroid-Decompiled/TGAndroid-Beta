package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ca1 implements org.telegram.ui.ActionBar.r1 {
    public final int f44732a;
    public final TwoStepVerificationActivity f44733b;

    public ca1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f44732a = i7;
        this.f44733b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44732a) {
            case 0:
                this.f44733b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f44733b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new da1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f44733b.p0();
                return;
            case 3:
                this.f44733b.z0();
                return;
            default:
                this.f44733b.z0();
                return;
        }
    }
}
