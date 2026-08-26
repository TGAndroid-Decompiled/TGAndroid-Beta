package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPhraseView f$0;

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPhraseView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkPaste(true);
                break;
            case 1:
                LoginActivity.LoginActivityPhraseView loginActivityPhraseView = this.f$0;
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = loginActivityPhraseView.codeField;
                anonymousClass4.requestFocus();
                String str = loginActivityPhraseView.beginning;
                if (str != null) {
                    if (str.length() > 1) {
                        String string = anonymousClass4.getText().toString();
                        int length = string.length();
                        int i = 0;
                        while (i < length && string.charAt(i) <= ' ') {
                            i++;
                        }
                        int length2 = loginActivityPhraseView.beginning.length() + i;
                        anonymousClass4.setSelection(Utilities.clamp(length2 + ((length2 < 0 || length2 >= string.length() || string.charAt(length2) != ' ') ? 0 : 1), string.length(), 0), anonymousClass4.getText().length());
                    }
                }
                anonymousClass4.setSelection(0, anonymousClass4.getText().length());
                break;
            case 2:
                this.f$0.animateError(false);
                break;
            default:
                UsersSelectActivity.AnonymousClass4 anonymousClass5 = this.f$0.codeField;
                if (anonymousClass5 != null) {
                    anonymousClass5.requestFocus();
                    anonymousClass5.setSelection(anonymousClass5.length());
                    AndroidUtilities.showKeyboard(anonymousClass5);
                }
                break;
        }
    }
}
