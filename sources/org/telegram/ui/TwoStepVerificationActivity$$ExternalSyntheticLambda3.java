package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda3(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showSetForcePasswordAlert$37(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$onPasswordForgot$17(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$cancelPasswordReset$10(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$createView$6(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onPasswordForgot$16(alertDialog, i);
                break;
        }
    }
}
