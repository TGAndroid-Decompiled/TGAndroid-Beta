package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$8(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onBackPressed$42(alertDialog, i);
                break;
        }
    }
}
