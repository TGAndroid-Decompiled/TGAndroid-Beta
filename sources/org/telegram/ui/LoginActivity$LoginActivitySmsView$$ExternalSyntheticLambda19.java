package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                loginActivitySmsView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                break;
            default:
                LoginActivity.this.setPage(0, true, null, true);
                break;
        }
    }
}
