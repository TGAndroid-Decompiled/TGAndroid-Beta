package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha1 implements Runnable {
    public final int f46270a;
    public final TwoStepVerificationActivity f46271b;

    public ha1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46270a = i7;
        this.f46271b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f46270a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f46271b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f42069s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42069s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f46271b;
                ha1 ha1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(ha1Var);
                org.telegram.messenger.g0.i3(ha1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f46271b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f42070w.a(0.0f);
                return;
            default:
                this.f46271b.D0();
                return;
        }
    }
}
