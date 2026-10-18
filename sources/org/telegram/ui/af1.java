package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class af1 implements org.telegram.ui.ActionBar.a2 {
    public final int f35396a;
    public final TwoStepVerificationActivity f35397b;

    public af1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35396a = i10;
        this.f35397b = twoStepVerificationActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35396a) {
            case 0:
                this.f35397b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35397b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new bf1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f35397b.k0();
                return;
            case 3:
                this.f35397b.u0();
                return;
            default:
                this.f35397b.u0();
                return;
        }
    }
}
