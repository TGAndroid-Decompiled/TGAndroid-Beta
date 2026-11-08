package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa1 implements Runnable {
    public final int f45526a;
    public final TwoStepVerificationActivity f45527b;

    public fa1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45526a = i7;
        this.f45527b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f45526a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45527b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f42062s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42062s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f45527b;
                fa1 fa1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(fa1Var);
                org.telegram.messenger.g0.i3(fa1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f45527b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f42063w.a(0.0f);
                return;
            default:
                this.f45527b.D0();
                return;
        }
    }
}
