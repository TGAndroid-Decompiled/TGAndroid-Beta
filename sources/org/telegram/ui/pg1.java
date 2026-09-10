package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class pg1 implements org.telegram.ui.ActionBar.c2 {
    public final int f35837a;
    public final TwoStepVerificationActivity f35838b;

    public pg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35837a = i10;
        this.f35838b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35837a) {
            case 0:
                this.f35838b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35838b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new qg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35838b.k0();
                return;
            case 3:
                this.f35838b.u0();
                return;
            default:
                this.f35838b.u0();
                return;
        }
    }
}
