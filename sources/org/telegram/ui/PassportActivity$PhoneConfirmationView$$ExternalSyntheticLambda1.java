package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda1 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PassportActivity.PhoneConfirmationView f$0;

    public PassportActivity$PhoneConfirmationView$$ExternalSyntheticLambda1(PassportActivity.PhoneConfirmationView phoneConfirmationView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneConfirmationView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resendCode$1(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onBackPressed$8(alertDialog, i);
                break;
        }
    }
}
