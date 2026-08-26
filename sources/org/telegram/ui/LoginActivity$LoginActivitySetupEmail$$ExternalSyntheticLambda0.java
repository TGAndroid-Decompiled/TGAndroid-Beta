package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RLottieImageView;

public final class LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySetupEmail f$0;

    public LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySetupEmail;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail = this.f$0;
                RLottieImageView rLottieImageView = loginActivitySetupEmail.inboxImageView;
                rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                rLottieImageView.playAnimation();
                EditTextBoldCursor editTextBoldCursor = loginActivitySetupEmail.emailField;
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                break;
            default:
                this.f$0.emailField.requestFocus();
                break;
        }
    }
}
