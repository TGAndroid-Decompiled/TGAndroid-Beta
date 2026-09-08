package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class lg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f38379a;
    public final TwoStepVerificationActivity f38380b;

    public lg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38379a = i10;
        this.f38380b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f38379a) {
            case 0:
                this.f38380b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38380b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new mg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f38380b.k0();
                return;
            case 3:
                this.f38380b.u0();
                return;
            default:
                this.f38380b.u0();
                return;
        }
    }
}
