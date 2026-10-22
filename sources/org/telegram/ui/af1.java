package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class af1 implements Runnable {
    public final int f35369a;
    public final TwoStepVerificationActivity f35370b;

    public af1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35369a = i10;
        this.f35370b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35369a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35370b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f33948s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f33948s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35370b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35370b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35370b;
                af1 af1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(af1Var);
                AndroidUtilities.runOnUIThread(af1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
