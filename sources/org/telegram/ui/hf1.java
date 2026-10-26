package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class hf1 implements org.telegram.ui.ActionBar.b2 {
    public final int f40002a;
    public final TwoStepVerificationActivity f40003b;

    public hf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40002a = i10;
        this.f40003b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f40002a) {
            case 0:
                this.f40003b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40003b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new if1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f40003b.l0();
                return;
            case 3:
                this.f40003b.v0();
                return;
            default:
                this.f40003b.v0();
                return;
        }
    }
}
