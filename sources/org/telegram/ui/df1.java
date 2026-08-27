package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

public final class df1 implements org.telegram.ui.ActionBar.a2 {

    public final int f37392a;

    public final TwoStepVerificationActivity f37393b;

    public df1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37392a = i10;
        this.f37393b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37392a) {
            case 0:
                this.f37393b.finishFragment();
                break;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37393b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ef1(twoStepVerificationActivity, 2));
                break;
            case 2:
                this.f37393b.k0();
                break;
            case 3:
                this.f37393b.u0();
                break;
            default:
                this.f37393b.u0();
                break;
        }
    }
}
