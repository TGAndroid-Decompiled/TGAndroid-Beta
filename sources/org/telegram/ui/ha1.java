package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha1 implements Runnable {
    public final int f48304a;
    public final TwoStepVerificationActivity f48305b;

    public ha1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48304a = i7;
        this.f48305b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f48304a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f48305b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f43927s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(twoStepVerificationActivity.f43927s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f48305b;
                ha1 ha1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(ha1Var);
                org.telegram.messenger.g0.h3(ha1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f48305b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f43928w.a(0.0f);
                return;
            default:
                this.f48305b.D0();
                return;
        }
    }
}
