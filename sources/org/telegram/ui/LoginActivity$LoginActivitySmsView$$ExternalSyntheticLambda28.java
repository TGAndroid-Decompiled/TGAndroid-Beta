package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final int f$1;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loginActivitySmsView;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(loginActivitySmsView, this.f$1, 1));
                break;
            case 1:
                this.f$0.tryShowProgress(this.f$1);
                break;
            default:
                this.f$0.codeFieldContainer.codeField[this.f$1].animateSuccessProgress(1.0f);
                break;
        }
    }
}
