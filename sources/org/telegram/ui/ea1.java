package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ea1 implements Runnable {
    public final int f45251a;
    public final TwoStepVerificationActivity f45252b;

    public ea1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45251a = i7;
        this.f45252b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f45251a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45252b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f42058s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42058s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f45252b;
                ea1 ea1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(ea1Var);
                org.telegram.messenger.g0.i3(ea1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f45252b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f42059w.a(0.0f);
                return;
            default:
                this.f45252b.D0();
                return;
        }
    }
}
