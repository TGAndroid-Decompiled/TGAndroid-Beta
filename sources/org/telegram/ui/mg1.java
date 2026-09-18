package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mg1 implements org.telegram.ui.ActionBar.b2 {
    public final int f35813a;
    public final TwoStepVerificationActivity f35814b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35813a = i10;
        this.f35814b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f35813a) {
            case 0:
                this.f35814b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35814b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ng1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35814b.k0();
                return;
            case 3:
                this.f35814b.u0();
                return;
            default:
                this.f35814b.u0();
                return;
        }
    }
}
