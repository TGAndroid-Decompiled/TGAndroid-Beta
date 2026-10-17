package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cf1 implements Runnable {
    public final int f35935a;
    public final TwoStepVerificationActivity f35936b;

    public cf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35935a = i10;
        this.f35936b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35935a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35936b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f33930s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f33930s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35936b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35936b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35936b;
                cf1 cf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(cf1Var);
                AndroidUtilities.runOnUIThread(cf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
