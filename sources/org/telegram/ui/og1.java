package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class og1 implements Runnable {
    public final int f40575a;
    public final TwoStepVerificationActivity f40576b;

    public og1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40575a = i10;
        this.f40576b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40575a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40576b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34618s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34618s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40576b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40576b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40576b;
                og1 og1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(og1Var);
                AndroidUtilities.runOnUIThread(og1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
