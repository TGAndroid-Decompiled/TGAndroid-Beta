package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jf1 implements Runnable {
    public final int f40620a;
    public final TwoStepVerificationActivity f40621b;

    public jf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40620a = i10;
        this.f40621b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f40620a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f40621b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f36308s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36308s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40621b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f40621b.z0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40621b;
                jf1 jf1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(jf1Var);
                AndroidUtilities.runOnUIThread(jf1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
