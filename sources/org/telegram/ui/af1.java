package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class af1 implements Runnable {
    public final int f35366a;
    public final TwoStepVerificationActivity f35367b;

    public af1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f35366a = i10;
        this.f35367b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35366a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f35367b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f33945s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f33945s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f35367b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f35367b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f35367b;
                af1 af1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(af1Var);
                AndroidUtilities.runOnUIThread(af1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
