package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bg1 implements Runnable {
    public final int f32882a;
    public final TwoStepVerificationActivity f32883b;

    public bg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f32882a = i10;
        this.f32883b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f32882a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f32883b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.E && (editTextBoldCursor = twoStepVerificationActivity.f32350s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f32350s);
                    return;
                }
                return;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f32883b;
                twoStepVerificationActivity2.R = false;
                twoStepVerificationActivity2.v.a(0.0f);
                return;
            case 2:
                this.f32883b.y0();
                return;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f32883b;
                bg1 bg1Var = twoStepVerificationActivity3.S;
                AndroidUtilities.cancelRunOnUIThread(bg1Var);
                AndroidUtilities.runOnUIThread(bg1Var, 1500L);
                twoStepVerificationActivity3.R = true;
                return;
        }
    }
}
