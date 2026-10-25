package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f39999a;
    public final TwoStepVerificationActivity f40000b;

    public hf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39999a = i10;
        this.f40000b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f39999a) {
            case 0:
                this.f40000b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40000b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new if1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40000b.l0();
                return;
            case 3:
                this.f40000b.v0();
                return;
            default:
                this.f40000b.v0();
                return;
        }
    }
}
