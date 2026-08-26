package org.telegram.ui;

public final class LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySetupEmail f$0;

    public LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySetupEmail;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onShow$9();
                break;
            default:
                this.f$0.lambda$onPasscodeError$4();
                break;
        }
    }
}
