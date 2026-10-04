package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f36310a;
    public final TwoStepVerificationActivity f36311b;

    public fg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36310a = i10;
        this.f36311b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36310a) {
            case 0:
                this.f36311b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36311b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new gg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f36311b.k0();
                return;
            case 3:
                this.f36311b.u0();
                return;
            default:
                this.f36311b.u0();
                return;
        }
    }
}
