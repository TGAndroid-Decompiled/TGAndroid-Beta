package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f40253a;
    public final TwoStepVerificationActivity f40254b;

    public ng1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40253a = i10;
        this.f40254b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40253a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40254b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34608s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34608s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40254b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40254b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40254b;
                ng1 ng1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(ng1Var);
                AndroidUtilities.runOnUIThread(ng1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
