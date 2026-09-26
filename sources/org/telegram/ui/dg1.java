package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class dg1 implements org.telegram.ui.ActionBar.z1 {
    public final int f33117a;
    public final TwoStepVerificationActivity f33118b;

    public dg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f33117a = i10;
        this.f33118b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33117a) {
            case 0:
                this.f33118b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f33118b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new eg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f33118b.k0();
                return;
            case 3:
                this.f33118b.u0();
                return;
            default:
                this.f33118b.u0();
                return;
        }
    }
}
