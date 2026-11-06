package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ea1 implements Runnable {
    public final int f45222a;
    public final TwoStepVerificationActivity f45223b;

    public ea1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f45222a = i7;
        this.f45223b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f45222a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f45223b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f42034s) != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(twoStepVerificationActivity.f42034s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f45223b;
                ea1 ea1Var = twoStepVerificationActivity2.V;
                org.telegram.messenger.g0.r(ea1Var);
                org.telegram.messenger.g0.i3(ea1Var, 1500L);
                twoStepVerificationActivity2.U = true;
                return;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f45223b;
                twoStepVerificationActivity3.U = false;
                twoStepVerificationActivity3.f42035w.a(0.0f);
                return;
            default:
                this.f45223b.D0();
                return;
        }
    }
}
