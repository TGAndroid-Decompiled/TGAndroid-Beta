package org.telegram.ui;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$shakeWrongCode$27();
                break;
            case 1:
                this.f$0.lambda$onPasscodeError$16();
                break;
            case 2:
                this.f$0.lambda$new$0();
                break;
            case 3:
                this.f$0.lambda$new$1();
                break;
            case 4:
                this.f$0.updateResetPendingDate();
                break;
            case 5:
                this.f$0.lambda$onShow$28();
                break;
            case 6:
                this.f$0.lambda$shakeWrongCode$26();
                break;
            case 7:
                this.f$0.lambda$onPasscodeError$15();
                break;
            default:
                this.f$0.requestEmailReset();
                break;
        }
    }
}
