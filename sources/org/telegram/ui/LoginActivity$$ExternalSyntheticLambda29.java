package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$$ExternalSyntheticLambda29 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity f$0;

    public LoginActivity$$ExternalSyntheticLambda29(LoginActivity loginActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDoneButtonPressed$13(alertDialog, i);
                break;
            default:
                this.f$0.lambda$resendCodeFromSafetyNet$19(alertDialog, i);
                break;
        }
    }
}
