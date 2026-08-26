package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.RichEditor;

public final class LoginActivity$$ExternalSyntheticLambda10 implements SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;

    public LoginActivity$$ExternalSyntheticLambda10(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
    }

    @Override
    public final void onSizeChanged(int i, boolean z) {
        LoginActivity$PhoneView$$ExternalSyntheticLambda6 loginActivity$PhoneView$$ExternalSyntheticLambda6;
        PasscodeActivity$$ExternalSyntheticLambda13 passcodeActivity$$ExternalSyntheticLambda13;
        switch (this.$r8$classId) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) this.f$0;
                if (i > AndroidUtilities.dp(20.0f) && loginActivity.isCustomKeyboardVisible()) {
                    AndroidUtilities.hideKeyboard(loginActivity.fragmentView);
                }
                if (i <= AndroidUtilities.dp(20.0f) && (loginActivity$PhoneView$$ExternalSyntheticLambda6 = loginActivity.keyboardHideCallback) != null) {
                    loginActivity$PhoneView$$ExternalSyntheticLambda6.run();
                    loginActivity.keyboardHideCallback = null;
                    break;
                }
                break;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                if (i >= AndroidUtilities.dp(20.0f) && (passcodeActivity$$ExternalSyntheticLambda13 = passcodeActivity.onShowKeyboardCallback) != null) {
                    passcodeActivity$$ExternalSyntheticLambda13.run();
                    passcodeActivity.onShowKeyboardCallback = null;
                    break;
                }
                break;
            case 2:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                botWebViewSheet.getClass();
                if (i > AndroidUtilities.dp(20.0f)) {
                    BotWebViewSheet.AnonymousClass1 anonymousClass1 = botWebViewSheet.swipeContainer;
                    anonymousClass1.stickTo(anonymousClass1.getTopActionBarOffsetY() + (-anonymousClass1.getOffsetY()), false, null);
                }
                break;
            default:
                ((RichEditor) this.f$0).getClass();
                break;
        }
    }
}
