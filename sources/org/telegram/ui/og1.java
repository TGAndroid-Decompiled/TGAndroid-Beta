package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og1 implements Runnable {
    public final int f36326a;
    public final TwoStepVerificationActivity f36327b;

    public og1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36326a = i10;
        this.f36327b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36326a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36327b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31902s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31902s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f36327b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f36327b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f36327b;
                og1 og1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(og1Var);
                AndroidUtilities.runOnUIThread(og1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
