package org.telegram.ui;

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
                this.f$0.lambda$onDialogDismiss$9();
                break;
            case 1:
                this.f$0.lambda$showProxyButtonDelayed$34();
                break;
            default:
                this.f$0.lambda$resendCodeFromSafetyNet$20();
                break;
        }
    }
}
