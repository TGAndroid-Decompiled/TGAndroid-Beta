package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda17(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$3(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$showSetForcePasswordAlert$51(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$createView$17(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$createView$6(alertDialog, i);
                break;
            default:
                this.f$0.lambda$processNext$32(alertDialog, i);
                break;
        }
    }
}
