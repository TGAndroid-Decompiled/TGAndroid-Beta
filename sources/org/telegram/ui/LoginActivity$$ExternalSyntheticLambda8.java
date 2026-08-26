package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity f$0;

    public LoginActivity$$ExternalSyntheticLambda8(LoginActivity loginActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.needRequestPermissions = false;
                break;
            case 1:
                LoginActivity loginActivity = this.f$0;
                loginActivity.proxyButtonVisible = false;
                loginActivity.showProxyButton(true, true);
                break;
            default:
                LoginActivity loginActivity2 = this.f$0;
                if (loginActivity2.getParentActivity() != null && !loginActivity2.getParentActivity().isFinishing() && loginActivity2.getParentActivity() != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity2.getParentActivity(), 0, null);
                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda32(loginActivity2, 1));
                    builder.show();
                    break;
                }
                break;
        }
    }
}
