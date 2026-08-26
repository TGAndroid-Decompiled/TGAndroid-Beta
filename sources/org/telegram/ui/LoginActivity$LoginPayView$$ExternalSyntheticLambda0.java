package org.telegram.ui;

public final class LoginActivity$LoginPayView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginPayView f$0;

    public LoginActivity$LoginPayView$$ExternalSyntheticLambda0(LoginActivity.LoginPayView loginPayView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginPayView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.poll();
                break;
            case 1:
                this.f$0.lambda$setParams$7();
                break;
            case 2:
                this.f$0.lambda$setParams$20();
                break;
            case 3:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.lambda$setParams$9();
                break;
        }
    }
}
