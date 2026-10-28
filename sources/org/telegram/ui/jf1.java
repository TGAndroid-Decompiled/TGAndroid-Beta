package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class jf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f40526a;
    public final TwoStepVerificationActivity f40527b;

    public jf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40526a = i10;
        this.f40527b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40526a) {
            case 0:
                this.f40527b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40527b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new kf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40527b.l0();
                return;
            case 3:
                this.f40527b.v0();
                return;
            default:
                this.f40527b.v0();
                return;
        }
    }
}
