package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gf1 implements Runnable {
    public final int f38533a;
    public final TwoStepVerificationActivity f38534b;

    public gf1(TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f38533a = i9;
        this.f38534b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f38533a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38534b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.D && (editTextBoldCursor = twoStepVerificationActivity.f36273s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36273s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f38534b;
                twoStepVerificationActivity2.Q = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f38534b.x0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f38534b;
                gf1 gf1Var = twoStepVerificationActivity3.R;
                AndroidUtilities.cancelRunOnUIThread(gf1Var);
                AndroidUtilities.runOnUIThread(gf1Var, 1500L);
                twoStepVerificationActivity3.Q = true;
                return;
        }
    }
}
