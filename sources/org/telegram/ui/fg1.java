package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fg1 implements Runnable {
    public final int f36311a;
    public final TwoStepVerificationActivity f36312b;

    public fg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36311a = i10;
        this.f36312b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36311a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36312b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34590s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34590s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f36312b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f36312b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f36312b;
                fg1 fg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(fg1Var);
                AndroidUtilities.runOnUIThread(fg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
