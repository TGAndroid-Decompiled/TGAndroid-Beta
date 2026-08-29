package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class if1 implements Runnable {
    public final int f39255a;
    public final TwoStepVerificationActivity f39256b;

    public if1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39255a = i10;
        this.f39256b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f39255a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f39256b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.D && (editTextBoldCursor = twoStepVerificationActivity.f36338s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36338s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f39256b;
                twoStepVerificationActivity2.Q = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f39256b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f39256b;
                if1 if1Var = twoStepVerificationActivity3.R;
                AndroidUtilities.cancelRunOnUIThread(if1Var);
                AndroidUtilities.runOnUIThread(if1Var, 1500L);
                twoStepVerificationActivity3.Q = true;
                return;
        }
    }
}
