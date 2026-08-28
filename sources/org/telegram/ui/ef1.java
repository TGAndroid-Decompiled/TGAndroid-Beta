package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ef1 implements org.telegram.ui.ActionBar.b2 {
    public final int f37928a;
    public final TwoStepVerificationActivity f37929b;

    public ef1(TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f37928a = i9;
        this.f37929b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f37928a) {
            case 0:
                this.f37929b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37929b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ff1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f37929b.j0();
                return;
            case 3:
                this.f37929b.t0();
                return;
            default:
                this.f37929b.t0();
                return;
        }
    }
}
