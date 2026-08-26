package org.telegram.ui;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.PhoneView f$0;

    public LoginActivity$PhoneView$$ExternalSyntheticLambda6(LoginActivity.PhoneView phoneView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onShow$25();
                break;
            case 1:
                this.f$0.lambda$requestPasskey$26();
                break;
            default:
                this.f$0.lambda$new$4();
                break;
        }
    }
}
