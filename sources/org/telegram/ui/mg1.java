package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mg1 implements Runnable {
    public final int f35747a;
    public final TwoStepVerificationActivity f35748b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35747a = i10;
        this.f35748b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35747a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35748b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31597s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31597s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35748b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35748b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35748b;
                mg1 mg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(mg1Var);
                AndroidUtilities.runOnUIThread(mg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
