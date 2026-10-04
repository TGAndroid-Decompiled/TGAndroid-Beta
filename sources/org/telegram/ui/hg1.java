package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hg1 implements Runnable {
    public final int f37070a;
    public final TwoStepVerificationActivity f37071b;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37070a = i10;
        this.f37071b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37070a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37071b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34571s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34571s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f37071b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f37071b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f37071b;
                hg1 hg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(hg1Var);
                AndroidUtilities.runOnUIThread(hg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
