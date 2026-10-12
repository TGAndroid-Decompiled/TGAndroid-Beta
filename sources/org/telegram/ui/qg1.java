package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qg1 implements Runnable {
    public final int f41327a;
    public final TwoStepVerificationActivity f41328b;

    public qg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41327a = i10;
        this.f41328b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f41327a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f41328b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34417s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34417s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f41328b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f41328b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f41328b;
                qg1 qg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(qg1Var);
                AndroidUtilities.runOnUIThread(qg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
