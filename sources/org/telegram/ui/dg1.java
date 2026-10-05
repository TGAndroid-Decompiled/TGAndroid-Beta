package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class dg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35812a;
    public final TwoStepVerificationActivity f35813b;

    public dg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35812a = i10;
        this.f35813b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35812a) {
            case 0:
                this.f35813b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35813b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new eg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35813b.k0();
                return;
            case 3:
                this.f35813b.u0();
                return;
            default:
                this.f35813b.u0();
                return;
        }
    }
}
