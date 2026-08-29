package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class gf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f38577a;
    public final TwoStepVerificationActivity f38578b;

    public gf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38577a = i10;
        this.f38578b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38577a) {
            case 0:
                this.f38578b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38578b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new hf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f38578b.k0();
                return;
            case 3:
                this.f38578b.u0();
                return;
            default:
                this.f38578b.u0();
                return;
        }
    }
}
