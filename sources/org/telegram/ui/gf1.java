package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gf1 implements Runnable {
    public final int f37557a;
    public final TwoStepVerificationActivity f37558b;

    public gf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37557a = i10;
        this.f37558b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37557a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37558b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34248s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34248s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f37558b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f37558b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f37558b;
                gf1 gf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(gf1Var);
                AndroidUtilities.runOnUIThread(gf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
