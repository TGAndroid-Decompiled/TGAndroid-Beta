package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mg1 implements Runnable {
    public final int f35665a;
    public final TwoStepVerificationActivity f35666b;

    public mg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35665a = i10;
        this.f35666b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35665a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35666b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31841s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31841s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35666b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35666b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35666b;
                mg1 mg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(mg1Var);
                AndroidUtilities.runOnUIThread(mg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
