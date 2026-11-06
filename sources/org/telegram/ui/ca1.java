package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class ca1 implements org.telegram.ui.ActionBar.r1 {
    public final int f44733a;
    public final TwoStepVerificationActivity f44734b;

    public ca1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f44733a = i7;
        this.f44734b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f44733a) {
            case 0:
                this.f44734b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f44734b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new da1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f44734b.p0();
                return;
            case 3:
                this.f44734b.z0();
                return;
            default:
                this.f44734b.z0();
                return;
        }
    }
}
