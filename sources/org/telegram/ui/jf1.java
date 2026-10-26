package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf1 implements Runnable {
    public final int f40623a;
    public final TwoStepVerificationActivity f40624b;

    public jf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40623a = i10;
        this.f40624b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40623a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40624b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f36311s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36311s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40624b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40624b.z0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40624b;
                jf1 jf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(jf1Var);
                AndroidUtilities.runOnUIThread(jf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
