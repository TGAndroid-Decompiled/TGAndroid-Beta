package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ia1 implements Runnable {
    public final int f46600a;
    public final TwoStepVerificationActivity f46601b;

    public ia1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46600a = i7;
        this.f46601b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f46600a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f46601b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f42060s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42060s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f46601b;
                ia1 ia1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(ia1Var);
                org.telegram.messenger.g0.i3(ia1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f46601b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f42061w.a(0.0f);
                return;
            default:
                this.f46601b.D0();
                return;
        }
    }
}
