package org.telegram.ui;

public final class LoginActivity$PhoneView$6$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final LoginActivity.PhoneView.AnonymousClass6 f$0;
    public final String f$1;
    public final LoginActivity.PhoneNumberConfirmView f$2;

    public LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(LoginActivity.PhoneView.AnonymousClass6 anonymousClass6, String str, LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView) {
        this.f$0 = anonymousClass6;
        this.f$1 = str;
        this.f$2 = phoneNumberConfirmView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onConfirm$0(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onConfirm$1(this.f$2, this.f$1);
                break;
        }
    }

    public LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(LoginActivity.PhoneView.AnonymousClass6 anonymousClass6, LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView, String str) {
        this.f$0 = anonymousClass6;
        this.f$2 = phoneNumberConfirmView;
        this.f$1 = str;
    }
}
