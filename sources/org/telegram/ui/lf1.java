package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lf1 implements Runnable {
    public final int f41138a;
    public final TwoStepVerificationActivity f41139b;

    public lf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41138a = i10;
        this.f41139b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f41138a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f41139b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f36335s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36335s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f41139b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f41139b.z0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f41139b;
                lf1 lf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(lf1Var);
                AndroidUtilities.runOnUIThread(lf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
