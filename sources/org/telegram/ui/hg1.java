package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hg1 implements Runnable {
    public final int f37069a;
    public final TwoStepVerificationActivity f37070b;

    public hg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37069a = i10;
        this.f37070b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f37069a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f37070b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.H && (editTextBoldCursor = twoStepVerificationActivity.f34570s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f34570s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f37070b;
                twoStepVerificationActivity2.U = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f37070b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f37070b;
                hg1 hg1Var = twoStepVerificationActivity3.V;
                AndroidUtilities.cancelRunOnUIThread(hg1Var);
                AndroidUtilities.runOnUIThread(hg1Var, 1500L);
                twoStepVerificationActivity3.U = true;
                return;
        }
    }
}
