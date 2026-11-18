package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ha1 implements Runnable {
    public final int f48226a;
    public final TwoStepVerificationActivity f48227b;

    public ha1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48226a = i7;
        this.f48227b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f48226a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f48227b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f43882s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(twoStepVerificationActivity.f43882s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f48227b;
                ha1 ha1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(ha1Var);
                org.telegram.messenger.g0.h3(ha1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f48227b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f43883w.a(0.0f);
                return;
            default:
                this.f48227b.D0();
                return;
        }
    }
}
