package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f40287a;
    public final TwoStepVerificationActivity f40288b;

    public ng1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40287a = i10;
        this.f40288b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40287a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40288b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34642s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34642s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40288b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40288b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40288b;
                ng1 ng1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(ng1Var);
                AndroidUtilities.runOnUIThread(ng1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
