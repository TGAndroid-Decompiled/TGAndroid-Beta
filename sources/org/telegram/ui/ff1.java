package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class ff1 implements Runnable {

    public final int f38121a;

    public final TwoStepVerificationActivity f38122b;

    public ff1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38121a = i10;
        this.f38122b = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f38121a) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f38122b;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.D && (editTextBoldCursor = twoStepVerificationActivity.f36276s) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.f36276s);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f38122b;
                twoStepVerificationActivity2.Q = false;
                twoStepVerificationActivity2.v.a(0.0f);
                break;
            case 2:
                this.f38122b.y0();
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f38122b;
                ff1 ff1Var = twoStepVerificationActivity3.R;
                AndroidUtilities.cancelRunOnUIThread(ff1Var);
                AndroidUtilities.runOnUIThread(ff1Var, 1500L);
                twoStepVerificationActivity3.Q = true;
                break;
        }
    }
}
