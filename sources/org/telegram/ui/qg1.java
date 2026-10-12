package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qg1 implements Runnable {
    public final int f41331a;
    public final TwoStepVerificationActivity f41332b;

    public qg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41331a = i10;
        this.f41332b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f41331a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f41332b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34419s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34419s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f41332b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f41332b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f41332b;
                qg1 qg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(qg1Var);
                AndroidUtilities.runOnUIThread(qg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
