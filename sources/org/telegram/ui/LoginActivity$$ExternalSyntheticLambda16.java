package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RLottieDrawable;

public final class LoginActivity$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityRegisterView f$0;

    public LoginActivity$$ExternalSyntheticLambda16(LoginActivity.LoginActivityRegisterView loginActivityRegisterView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityRegisterView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.imageUpdater.openGallery();
                break;
            case 1:
                LoginActivity.LoginActivityRegisterView loginActivityRegisterView = this.f$0;
                loginActivityRegisterView.avatar = null;
                loginActivityRegisterView.avatarBig = null;
                loginActivityRegisterView.showAvatarProgress$7(true);
                loginActivityRegisterView.avatarImage.setImage(null, null, loginActivityRegisterView.avatarDrawable, null);
                RLottieDrawable rLottieDrawable = loginActivityRegisterView.cameraDrawable;
                loginActivityRegisterView.avatarEditor.setAnimation(rLottieDrawable);
                rLottieDrawable.setCurrentFrame(0, true, false);
                loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
                break;
            case 2:
                this.f$0.isCameraWaitAnimationAllowed = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.f$0.firstNameField;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                break;
        }
    }
}
