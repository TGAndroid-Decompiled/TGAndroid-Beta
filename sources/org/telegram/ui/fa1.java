package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class fa1 implements org.telegram.ui.ActionBar.r1 {
    public final int f47584a;
    public final TwoStepVerificationActivity f47585b;

    public fa1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f47584a = i7;
        this.f47585b = twoStepVerificationActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47584a) {
            case 0:
                this.f47585b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f47585b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ga1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f47585b.p0();
                return;
            case 3:
                this.f47585b.z0();
                return;
            default:
                this.f47585b.z0();
                return;
        }
    }
}
