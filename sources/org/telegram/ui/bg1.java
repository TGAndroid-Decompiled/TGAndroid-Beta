package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bg1 implements Runnable {
    public final int f35529a;
    public final TwoStepVerificationActivity f35530b;

    public bg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35529a = i10;
        this.f35530b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35529a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35530b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.E && (editTextBoldCursor = twoStepVerificationActivity.f34918s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34918s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35530b;
                twoStepVerificationActivity2.R = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35530b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35530b;
                bg1 bg1Var = twoStepVerificationActivity3.S;
                AndroidUtilities.cancelRunOnUIThread(bg1Var);
                AndroidUtilities.runOnUIThread(bg1Var, 1500L);
                twoStepVerificationActivity3.R = true;
                return;
        }
    }
}
