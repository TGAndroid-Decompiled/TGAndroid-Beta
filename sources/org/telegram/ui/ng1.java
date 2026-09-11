package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f38953a;
    public final TwoStepVerificationActivity f38954b;

    public ng1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38953a = i10;
        this.f38954b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f38953a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38954b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34225s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34225s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f38954b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f38954b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f38954b;
                ng1 ng1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(ng1Var);
                AndroidUtilities.runOnUIThread(ng1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
