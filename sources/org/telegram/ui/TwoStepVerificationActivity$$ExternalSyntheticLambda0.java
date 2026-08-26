package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda0(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
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
                this.f$0.clearPassword();
                break;
            case 2:
                TwoStepVerificationActivity twoStepVerificationActivity = this.f$0;
                twoStepVerificationActivity.getClass();
                twoStepVerificationActivity.getConnectionsManager().sendRequest(new TL_account.declinePasswordReset(), new TwoStepVerificationActivity$$ExternalSyntheticLambda1(twoStepVerificationActivity, 2));
                break;
            case 3:
                this.f$0.resetPassword();
                break;
            default:
                this.f$0.resetPassword();
                break;
        }
    }
}
