package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class mg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35730a;
    public final TwoStepVerificationActivity f35731b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35730a = i10;
        this.f35731b = twoStepVerificationActivity;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35730a) {
            case 0:
                this.f35731b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35731b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ng1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35731b.k0();
                return;
            case 3:
                this.f35731b.u0();
                return;
            default:
                this.f35731b.u0();
                return;
        }
    }
}
