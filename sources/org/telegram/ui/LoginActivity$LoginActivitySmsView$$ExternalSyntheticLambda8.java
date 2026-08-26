package org.telegram.ui;

import android.view.View;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(LoginActivity.LoginActivitySmsView loginActivitySmsView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
    }

    @Override
    public final void run() {
        CodeFieldContainer codeFieldContainer;
        CodeNumberField[] codeNumberFieldArr;
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        LoginActivity.LoginActivitySmsView loginActivitySmsView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                int i4 = loginActivitySmsView.currentType;
                if (i4 != 3 && (codeNumberFieldArr = (codeFieldContainer = loginActivitySmsView.codeFieldContainer).codeField) != null) {
                    for (int length = codeNumberFieldArr.length - 1; length >= 0; length--) {
                        if (length == 0 || codeFieldContainer.codeField[length].length() != 0) {
                            codeFieldContainer.codeField[length].requestFocus();
                            CodeNumberField codeNumberField = codeFieldContainer.codeField[length];
                            codeNumberField.setSelection(codeNumberField.length());
                            CodeNumberField codeNumberField2 = codeFieldContainer.codeField[length];
                            if (!LoginActivity.this.isCustomKeyboardVisible()) {
                                AndroidUtilities.showKeyboard(codeNumberField2);
                            }
                        }
                    }
                }
                RLottieDrawable rLottieDrawable = loginActivitySmsView.hintDrawable;
                if (rLottieDrawable != null) {
                    rLottieDrawable.start();
                }
                if (i4 == 15) {
                    RLottieImageView rLottieImageView = loginActivitySmsView.openFragmentImageView;
                    rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                    rLottieImageView.getAnimatedDrawable().start();
                }
                break;
            case 1:
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView, 5));
                break;
            case 2:
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView, i));
                break;
            case 3:
                RLottieImageView rLottieImageView2 = loginActivitySmsView.blueImageView;
                rLottieImageView2.setAutoRepeat(true);
                RLottieDrawable rLottieDrawable2 = loginActivitySmsView.dotsDrawable;
                rLottieDrawable2.setCurrentFrame(0, false, false);
                rLottieDrawable2.setAutoRepeat(1);
                rLottieImageView2.setAnimation(rLottieDrawable2);
                rLottieImageView2.playAnimation();
                break;
            case 4:
                loginActivitySmsView.getClass();
                try {
                    LoginActivity.this.fragmentView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(loginActivitySmsView.getContext(), 0, null);
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), loginActivitySmsView.requestPhone, PhoneFormat.getInstance()));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                alertDialog.setOnDismissListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45(loginActivitySmsView, i2));
                builder.show();
                break;
            case 5:
                RLottieDrawable rLottieDrawable3 = loginActivitySmsView.dotsToStarsDrawable;
                rLottieDrawable3.onAnimationEndListener = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView, 7);
                RLottieImageView rLottieImageView3 = loginActivitySmsView.blueImageView;
                rLottieImageView3.setAutoRepeat(false);
                rLottieDrawable3.setCurrentFrame(0, false, false);
                rLottieImageView3.setAnimation(rLottieDrawable3);
                rLottieImageView3.playAnimation();
                break;
            case 6:
                loginActivitySmsView.getClass();
                loginActivitySmsView.postDelayed(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView, 8), 150L);
                break;
            case 7:
                loginActivitySmsView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(loginActivitySmsView, 9));
                break;
            case 8:
                CodeFieldContainer codeFieldContainer2 = loginActivitySmsView.codeFieldContainer;
                codeFieldContainer2.isFocusSuppressed = false;
                codeFieldContainer2.codeField[0].requestFocus();
                while (true) {
                    CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer2.codeField;
                    if (i3 < codeNumberFieldArr2.length) {
                        CodeNumberField.animateSpring(codeNumberFieldArr2[i3].errorSpringAnimation, 0.0f);
                        i3++;
                    }
                    break;
                }
                break;
            case 9:
                RLottieImageView rLottieImageView4 = loginActivitySmsView.blueImageView;
                rLottieImageView4.setAutoRepeat(false);
                rLottieImageView4.setAnimation(loginActivitySmsView.hintDrawable);
                break;
            default:
                loginActivitySmsView.postedErrorColorTimeout = false;
                while (true) {
                    CodeNumberField[] codeNumberFieldArr3 = loginActivitySmsView.codeFieldContainer.codeField;
                    if (i3 >= codeNumberFieldArr3.length) {
                        View view = loginActivitySmsView.currentType == 15 ? loginActivitySmsView.openFragmentButton : loginActivitySmsView.problemFrame;
                        LoginActivity.LoginActivitySmsView.AnonymousClass4 anonymousClass4 = loginActivitySmsView.errorViewSwitcher;
                        if (anonymousClass4.getCurrentView() != view) {
                            anonymousClass4.showNext();
                        }
                    } else {
                        CodeNumberField.animateSpring(codeNumberFieldArr3[i3].errorSpringAnimation, 0.0f);
                        i3++;
                    }
                    break;
                }
                break;
        }
    }
}
