package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ff1 implements org.telegram.ui.ActionBar.z1 {
    public final int f37325a;
    public final TwoStepVerificationActivity f37326b;

    public ff1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37325a = i10;
        this.f37326b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37325a) {
            case 0:
                this.f37326b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37326b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new gf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f37326b.k0();
                return;
            case 3:
                this.f37326b.u0();
                return;
            default:
                this.f37326b.u0();
                return;
        }
    }
}
