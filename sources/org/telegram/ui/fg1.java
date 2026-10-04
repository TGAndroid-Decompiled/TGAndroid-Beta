package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f36305a;
    public final TwoStepVerificationActivity f36306b;

    public fg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36305a = i10;
        this.f36306b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36305a) {
            case 0:
                this.f36306b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36306b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new gg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f36306b.k0();
                return;
            case 3:
                this.f36306b.u0();
                return;
            default:
                this.f36306b.u0();
                return;
        }
    }
}
