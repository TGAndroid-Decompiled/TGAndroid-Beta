package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fg1 implements Runnable {
    public final int f33673a;
    public final TwoStepVerificationActivity f33674b;

    public fg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f33673a = i10;
        this.f33674b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f33673a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f33674b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31882s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31882s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f33674b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f33674b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f33674b;
                fg1 fg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(fg1Var);
                AndroidUtilities.runOnUIThread(fg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
