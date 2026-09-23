package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class dg1 implements org.telegram.ui.ActionBar.a2 {
    public final int f32655a;
    public final TwoStepVerificationActivity f32656b;

    public dg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f32655a = i10;
        this.f32656b = twoStepVerificationActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32655a) {
            case 0:
                this.f32656b.finishFragment();
                return;
            case 1:
                TL_account.declinePasswordReset declinepasswordreset = new TL_account.declinePasswordReset();
                TwoStepVerificationActivity twoStepVerificationActivity = this.f32656b;
                twoStepVerificationActivity.getConnectionsManager().sendRequest(declinepasswordreset, new eg1(twoStepVerificationActivity, 2));
                return;
            case 2:
                this.f32656b.k0();
                return;
            case 3:
                this.f32656b.u0();
                return;
            default:
                this.f32656b.u0();
                return;
        }
    }
}
