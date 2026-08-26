package org.telegram.ui;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryShowProgress$14();
                break;
            case 1:
                this.f$0.lambda$onShow$44();
                break;
            case 2:
                this.f$0.lambda$onNextPressed$23();
                break;
            case 3:
                this.f$0.lambda$new$0();
                break;
            case 4:
                this.f$0.lambda$tryHideProgress$19();
                break;
            case 5:
                this.f$0.lambda$tryHideProgress$18();
                break;
            case 6:
                this.f$0.lambda$shakeWrongCode$40();
                break;
            case 7:
                this.f$0.lambda$shakeWrongCode$41();
                break;
            case 8:
                this.f$0.lambda$tryHideProgress$17();
                break;
            case 9:
                this.f$0.lambda$tryHideProgress$16();
                break;
            default:
                this.f$0.lambda$tryShowProgress$15();
                break;
        }
    }
}
