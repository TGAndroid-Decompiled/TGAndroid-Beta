package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class fa1 implements Runnable {
    public final int f47738a;
    public final TwoStepVerificationActivity f47739b;

    public fa1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f47738a = i7;
        this.f47739b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f47738a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f47739b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f44008s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(twoStepVerificationActivity.f44008s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f47739b;
                fa1 fa1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(fa1Var);
                org.telegram.messenger.g0.h3(fa1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f47739b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f44009w.a(0.0f);
                return;
            default:
                this.f47739b.D0();
                return;
        }
    }
}
