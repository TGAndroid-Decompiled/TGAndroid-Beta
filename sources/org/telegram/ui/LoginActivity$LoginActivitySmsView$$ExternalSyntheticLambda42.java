package org.telegram.ui;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda42 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final int f$1;
    public final boolean f$2;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda42(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i, boolean z, int i2) {
        this.$r8$classId = i2;
        this.f$0 = loginActivitySmsView;
        this.f$1 = i;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$tryShowProgress$12(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$tryShowProgress$13(this.f$1, this.f$2);
                break;
        }
    }
}
