package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class da1 implements org.telegram.ui.ActionBar.r1 {
    public final int f45036a;
    public final TwoStepVerificationActivity f45037b;

    public da1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45036a = i7;
        this.f45037b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f45036a) {
            case 0:
                this.f45037b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45037b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new ea1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f45037b.p0();
                return;
            case 3:
                this.f45037b.z0();
                return;
            default:
                this.f45037b.z0();
                return;
        }
    }
}
