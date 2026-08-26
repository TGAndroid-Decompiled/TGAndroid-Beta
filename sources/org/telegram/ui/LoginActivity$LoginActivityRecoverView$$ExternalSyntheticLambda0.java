package org.telegram.ui;

public final class LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRecoverView f$0;

    public LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityRecoverView loginActivityRecoverView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityRecoverView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onShow$9();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            case 2:
                this.f$0.lambda$onPasscodeError$6();
                break;
            default:
                this.f$0.lambda$onPasscodeError$5();
                break;
        }
    }
}
