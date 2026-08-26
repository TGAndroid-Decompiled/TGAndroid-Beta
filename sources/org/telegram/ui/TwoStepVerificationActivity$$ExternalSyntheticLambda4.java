package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda4(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.$r8$classId) {
            case 0:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f$0;
                if (!twoStepVerificationActivity.isFinishing() && !twoStepVerificationActivity.destroyed && (editTextBoldCursor = twoStepVerificationActivity.passwordEditText) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationActivity.passwordEditText);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationActivity twoStepVerificationActivity2 = this.f$0;
                twoStepVerificationActivity2.postedErrorColorTimeout = false;
                OutlineTextContainerView.animateSpring(twoStepVerificationActivity2.passwordOutlineView.errorSpring, 0.0f);
                break;
            case 2:
                this.f$0.updateBottomButton();
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity3 = this.f$0;
                TwoStepVerificationActivity$$ExternalSyntheticLambda4 twoStepVerificationActivity$$ExternalSyntheticLambda4 = twoStepVerificationActivity3.errorColorTimeout;
                AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
                AndroidUtilities.runOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4, 1500L);
                twoStepVerificationActivity3.postedErrorColorTimeout = true;
                break;
        }
    }
}
