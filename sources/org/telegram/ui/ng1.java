package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f35986a;
    public final TwoStepVerificationActivity f35987b;

    public ng1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35986a = i10;
        this.f35987b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35986a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35987b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31594s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31594s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35987b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35987b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35987b;
                ng1 ng1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(ng1Var);
                AndroidUtilities.runOnUIThread(ng1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
