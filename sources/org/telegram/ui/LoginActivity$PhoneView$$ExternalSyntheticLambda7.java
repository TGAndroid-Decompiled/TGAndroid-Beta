package org.telegram.ui;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.PhoneView f$0;
    public final String f$1;

    public LoginActivity$PhoneView$$ExternalSyntheticLambda7(LoginActivity.PhoneView phoneView, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneView;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$17(this.f$1);
                break;
            default:
                this.f$0.lambda$onNextPressed$16(this.f$1);
                break;
        }
    }
}
