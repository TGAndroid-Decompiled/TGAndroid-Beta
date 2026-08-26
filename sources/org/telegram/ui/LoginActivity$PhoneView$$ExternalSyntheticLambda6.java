package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

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
                LoginActivity.PhoneView phoneView = this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                LoginActivity.PhoneView.AnonymousClass3 anonymousClass3 = phoneView.phoneField;
                if (anonymousClass3 != null) {
                    boolean z = loginActivity.needRequestPermissions;
                    NewContactBottomSheet.AnonymousClass3 anonymousClass4 = phoneView.codeField;
                    if (z) {
                        anonymousClass4.clearFocus();
                        anonymousClass3.clearFocus();
                    } else if (anonymousClass4.length() != 0) {
                        anonymousClass3.requestFocus();
                        if (!phoneView.numberFilled) {
                            anonymousClass3.setSelection(anonymousClass3.length());
                        }
                        if (!loginActivity.isCustomKeyboardVisible()) {
                            AndroidUtilities.showKeyboard(anonymousClass3);
                        }
                    } else {
                        anonymousClass4.requestFocus();
                        if (!loginActivity.isCustomKeyboardVisible()) {
                            AndroidUtilities.showKeyboard(anonymousClass4);
                        }
                    }
                }
                if (loginActivity.activityMode == 0) {
                    phoneView.requestPasskey(false);
                }
                break;
            case 1:
                this.f$0.onNextPressed(null);
                break;
            case 2:
                this.f$0.requestPasskey(true);
                break;
            case 3:
                LoginActivity.PhoneView phoneView2 = this.f$0;
                if (!LoginActivity.this.isCustomKeyboardVisible()) {
                    AndroidUtilities.showKeyboard(phoneView2.phoneField);
                }
                break;
            default:
                LoginActivity.PhoneView phoneView3 = this.f$0;
                phoneView3.getClass();
                phoneView3.postDelayed(new LoginActivity$PhoneView$$ExternalSyntheticLambda6(phoneView3, 1), 200L);
                break;
        }
    }
}
