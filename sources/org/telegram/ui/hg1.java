package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hg1 implements Runnable {
    public final int f37075a;
    public final TwoStepVerificationActivity f37076b;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37075a = i10;
        this.f37076b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37075a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37076b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34577s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34577s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f37076b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f37076b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f37076b;
                hg1 hg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(hg1Var);
                AndroidUtilities.runOnUIThread(hg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
