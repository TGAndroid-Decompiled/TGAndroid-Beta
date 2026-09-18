package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class kg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35098a;
    public final TwoStepVerificationActivity f35099b;

    public kg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35098a = i10;
        this.f35099b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35098a) {
            case 0:
                this.f35099b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35099b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new lg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35099b.k0();
                return;
            case 3:
                this.f35099b.u0();
                return;
            default:
                this.f35099b.u0();
                return;
        }
    }
}
