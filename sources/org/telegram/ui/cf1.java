package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cf1 implements Runnable {
    public final int f35902a;
    public final TwoStepVerificationActivity f35903b;

    public cf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35902a = i10;
        this.f35903b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35902a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35903b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f33930s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f33930s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35903b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35903b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35903b;
                cf1 cf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(cf1Var);
                AndroidUtilities.runOnUIThread(cf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
