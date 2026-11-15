package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class da1 implements Runnable {
    public final int f46346a;
    public final TwoStepVerificationActivity f46347b;

    public da1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46346a = i7;
        this.f46347b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f46346a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f46347b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.I && (editTextBoldCursor = twoStepVerificationActivity.f43436s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(twoStepVerificationActivity.f43436s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f46347b;
                da1 da1Var = twoStepVerificationActivity2.W;
                org.telegram.messenger.g0.r(da1Var);
                org.telegram.messenger.g0.i3(da1Var, 1500L);
                twoStepVerificationActivity2.V = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f46347b;
                twoStepVerificationActivity3.V = false;
                twoStepVerificationActivity3.f43437w.a(0.0f);
                return;
            default:
                this.f46347b.D0();
                return;
        }
    }
}
