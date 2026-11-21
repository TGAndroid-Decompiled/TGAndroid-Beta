package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha1 implements Runnable {
    public final int f48300a;
    public final TwoStepVerificationActivity f48301b;

    public ha1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48300a = i7;
        this.f48301b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f48300a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f48301b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f43923s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(twoStepVerificationActivity.f43923s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f48301b;
                ha1 ha1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(ha1Var);
                org.telegram.messenger.g0.h3(ha1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f48301b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f43924w.a(0.0f);
                return;
            default:
                this.f48301b.D0();
                return;
        }
    }
}
