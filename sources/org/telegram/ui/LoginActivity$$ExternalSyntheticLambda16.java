package org.telegram.ui;

public final class LoginActivity$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRegisterView f$0;

    public LoginActivity$$ExternalSyntheticLambda16(LoginActivity.LoginActivityRegisterView loginActivityRegisterView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityRegisterView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.lambda$onRequestPermissionsResultFragment$8(this.f$0);
                break;
            case 1:
                this.f$0.lambda$new$5();
                break;
            case 2:
                this.f$0.lambda$new$4();
                break;
            default:
                this.f$0.lambda$onShow$15();
                break;
        }
    }
}
