package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ba1 implements org.telegram.ui.ActionBar.q1 {
    public final int f45666a;
    public final TwoStepVerificationActivity f45667b;

    public ba1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45666a = i7;
        this.f45667b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f45666a) {
            case 0:
                this.f45667b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45667b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ca1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f45667b.p0();
                return;
            case 3:
                this.f45667b.z0();
                return;
            default:
                this.f45667b.z0();
                return;
        }
    }
}
