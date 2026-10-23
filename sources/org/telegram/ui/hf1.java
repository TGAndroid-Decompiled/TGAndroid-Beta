package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hf1 implements Runnable {
    public final int f37841a;
    public final TwoStepVerificationActivity f37842b;

    public hf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37841a = i10;
        this.f37842b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37841a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37842b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34246s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34246s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f37842b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f37842b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f37842b;
                hf1 hf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(hf1Var);
                AndroidUtilities.runOnUIThread(hf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
