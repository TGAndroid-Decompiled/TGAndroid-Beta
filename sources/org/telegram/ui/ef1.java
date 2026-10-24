package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ef1 implements org.telegram.ui.ActionBar.z1 {
    public final int f36900a;
    public final TwoStepVerificationActivity f36901b;

    public ef1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36900a = i10;
        this.f36901b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f36900a) {
            case 0:
                this.f36901b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36901b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ff1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f36901b.k0();
                return;
            case 3:
                this.f36901b.u0();
                return;
            default:
                this.f36901b.u0();
                return;
        }
    }
}
