package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fg1 implements Runnable {
    public final int f33675a;
    public final TwoStepVerificationActivity f33676b;

    public fg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f33675a = i10;
        this.f33676b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f33675a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f33676b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31884s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31884s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f33676b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f33676b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f33676b;
                fg1 fg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(fg1Var);
                AndroidUtilities.runOnUIThread(fg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
