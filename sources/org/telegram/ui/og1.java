package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og1 implements Runnable {
    public final int f36343a;
    public final TwoStepVerificationActivity f36344b;

    public og1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36343a = i10;
        this.f36344b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f36343a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f36344b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f31610s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f31610s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f36344b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f36344b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f36344b;
                og1 og1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(og1Var);
                AndroidUtilities.runOnUIThread(og1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
