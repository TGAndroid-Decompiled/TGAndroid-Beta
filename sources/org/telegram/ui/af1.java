package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class af1 implements Runnable {
    public final int f35357a;
    public final TwoStepVerificationActivity f35358b;

    public af1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35357a = i10;
        this.f35358b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35357a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35358b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f33936s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f33936s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35358b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35358b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35358b;
                af1 af1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(af1Var);
                AndroidUtilities.runOnUIThread(af1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
