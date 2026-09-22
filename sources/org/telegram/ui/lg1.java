package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class lg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35483a;
    public final TwoStepVerificationActivity f35484b;

    public lg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35483a = i10;
        this.f35484b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35483a) {
            case 0:
                this.f35484b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35484b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new mg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35484b.k0();
                return;
            case 3:
                this.f35484b.u0();
                return;
            default:
                this.f35484b.u0();
                return;
        }
    }
}
