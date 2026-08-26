package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;

public final class LoginActivity$$ExternalSyntheticLambda32 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LoginActivity f$0;

    public LoginActivity$$ExternalSyntheticLambda32(LoginActivity loginActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity loginActivity = this.f$0;
                loginActivity.views[loginActivity.currentViewNum].onCancelPressed();
                loginActivity.needHideProgress(true, true);
                break;
            default:
                LoginActivity loginActivity2 = this.f$0;
                loginActivity2.forceDisableSafetyNet = true;
                if (loginActivity2.currentViewNum != 0) {
                    loginActivity2.setPage(0, true, null, true);
                }
                break;
        }
    }
}
