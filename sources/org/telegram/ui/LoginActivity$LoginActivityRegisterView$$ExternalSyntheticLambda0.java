package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRegisterView f$0;

    public LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityRegisterView loginActivityRegisterView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityRegisterView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showTermsOfService$1(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$showTermsOfService$2(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$onBackPressed$14(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$showTermsOfService$0(alertDialog, i);
                break;
            default:
                this.f$0.lambda$showTermsOfService$3(alertDialog, i);
                break;
        }
    }
}
