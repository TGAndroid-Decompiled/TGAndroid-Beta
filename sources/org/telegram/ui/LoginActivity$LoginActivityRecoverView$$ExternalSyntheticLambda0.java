package org.telegram.ui;

import org.telegram.ui.Components.RLottieImageView;

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
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView = this.f$0;
                RLottieImageView rLottieImageView = loginActivityRecoverView.inboxImageView;
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                rLottieImageView.playAnimation();
                PasscodeActivity.AnonymousClass8 anonymousClass8 = loginActivityRecoverView.codeFieldContainer;
                if (anonymousClass8 != null) {
                    anonymousClass8.codeField[0].requestFocus();
                }
                break;
            case 1:
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView2 = this.f$0;
                int i = 0;
                loginActivityRecoverView2.postedErrorColorTimeout = false;
                while (true) {
                    CodeNumberField[] codeNumberFieldArr = loginActivityRecoverView2.codeFieldContainer.codeField;
                    if (i < codeNumberFieldArr.length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr[i].errorSpringAnimation, 0.0f);
                        i++;
                    }
                    break;
                }
                break;
            case 2:
                LoginActivity.LoginActivityRecoverView loginActivityRecoverView3 = this.f$0;
                loginActivityRecoverView3.getClass();
                loginActivityRecoverView3.postDelayed(new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(loginActivityRecoverView3, 3), 150L);
                LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0 loginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0 = loginActivityRecoverView3.errorColorTimeout;
                loginActivityRecoverView3.removeCallbacks(loginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0);
                loginActivityRecoverView3.postDelayed(loginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0, 3000L);
                loginActivityRecoverView3.postedErrorColorTimeout = true;
                break;
            default:
                PasscodeActivity.AnonymousClass8 anonymousClass9 = this.f$0.codeFieldContainer;
                int i2 = 0;
                anonymousClass9.isFocusSuppressed = false;
                anonymousClass9.codeField[0].requestFocus();
                while (true) {
                    CodeNumberField[] codeNumberFieldArr2 = anonymousClass9.codeField;
                    if (i2 < codeNumberFieldArr2.length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr2[i2].errorSpringAnimation, 0.0f);
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
