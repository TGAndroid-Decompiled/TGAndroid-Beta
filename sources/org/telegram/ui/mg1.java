package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f39951a;
    public final TwoStepVerificationActivity f39952b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39951a = i10;
        this.f39952b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39951a) {
            case 0:
                this.f39952b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f39952b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ng1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f39952b.k0();
                return;
            case 3:
                this.f39952b.u0();
                return;
            default:
                this.f39952b.u0();
                return;
        }
    }
}
