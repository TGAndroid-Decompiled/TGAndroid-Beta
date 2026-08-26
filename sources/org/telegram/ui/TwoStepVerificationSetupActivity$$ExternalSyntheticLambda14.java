package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showSetForcePasswordAlert$51(alertDialog, i);
                break;
            case 1:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                twoStepVerificationSetupActivity.onReset();
                twoStepVerificationSetupActivity.finishFragment();
                break;
            case 2:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                twoStepVerificationSetupActivity2.email = "";
                twoStepVerificationSetupActivity2.setNewPassword(false);
                break;
            case 3:
                this.f$0.lambda$createView$3$1$4();
                break;
            default:
                this.f$0.lambda$processNext$32();
                break;
        }
    }
}
