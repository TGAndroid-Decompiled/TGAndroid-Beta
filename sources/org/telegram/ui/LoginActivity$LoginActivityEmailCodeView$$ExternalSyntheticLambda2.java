package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RLottieImageView;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                boolean z = false;
                loginActivityEmailCodeView.postedErrorColorTimeout = false;
                int i = 0;
                while (true) {
                    CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                    if (i >= codeNumberFieldArr.length) {
                        LoginActivity.LoginActivitySmsView.AnonymousClass4 anonymousClass4 = loginActivityEmailCodeView.errorViewSwitcher;
                        if (anonymousClass4.getCurrentView() != loginActivityEmailCodeView.resendFrameLayout) {
                            anonymousClass4.showNext();
                            FrameLayout frameLayout = loginActivityEmailCodeView.cantAccessEmailFrameLayout;
                            if (loginActivityEmailCodeView.resendCodeView.getVisibility() != 0 && LoginActivity.this.activityMode != 3 && !loginActivityEmailCodeView.isSetup) {
                                z = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, true);
                        }
                    } else {
                        CodeNumberField.animateSpring(codeNumberFieldArr[i].errorSpringAnimation, 0.0f);
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                this.f$0.requestEmailReset();
                break;
            case 2:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                loginActivityEmailCodeView2.getClass();
                loginActivityEmailCodeView2.postDelayed(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(loginActivityEmailCodeView2, 3), 150L);
                LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2 = loginActivityEmailCodeView2.errorColorTimeout;
                loginActivityEmailCodeView2.removeCallbacks(loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2);
                loginActivityEmailCodeView2.postDelayed(loginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2, 3000L);
                loginActivityEmailCodeView2.postedErrorColorTimeout = true;
                break;
            case 3:
                PasscodeActivity.AnonymousClass8 anonymousClass8 = this.f$0.codeFieldContainer;
                int i2 = 0;
                anonymousClass8.isFocusSuppressed = false;
                anonymousClass8.codeField[0].requestFocus();
                while (true) {
                    CodeNumberField[] codeNumberFieldArr2 = anonymousClass8.codeField;
                    if (i2 < codeNumberFieldArr2.length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr2[i2].errorSpringAnimation, 0.0f);
                        i2++;
                    }
                    break;
                }
                break;
            case 4:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView3 = this.f$0;
                loginActivityEmailCodeView3.getClass();
                loginActivityEmailCodeView3.postDelayed(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(loginActivityEmailCodeView3, 5), 150L);
                break;
            case 5:
                PasscodeActivity.AnonymousClass8 anonymousClass9 = this.f$0.codeFieldContainer;
                int i3 = 0;
                anonymousClass9.isFocusSuppressed = false;
                anonymousClass9.codeField[0].requestFocus();
                while (true) {
                    CodeNumberField[] codeNumberFieldArr3 = anonymousClass9.codeField;
                    if (i3 < codeNumberFieldArr3.length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr3[i3].errorSpringAnimation, 0.0f);
                        i3++;
                    }
                    break;
                }
                break;
            case 6:
                this.f$0.showResendCodeView(true);
                break;
            case 7:
                this.f$0.updateResetPendingDate();
                break;
            default:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView4 = this.f$0;
                RLottieImageView rLottieImageView = loginActivityEmailCodeView4.inboxImageView;
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                rLottieImageView.playAnimation();
                PasscodeActivity.AnonymousClass8 anonymousClass10 = loginActivityEmailCodeView4.codeFieldContainer;
                if (anonymousClass10 != null && anonymousClass10.codeField != null) {
                    anonymousClass10.setText("");
                    anonymousClass10.codeField[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
