package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;

public final class ChatActivity$$ExternalSyntheticLambda350 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;

    public ChatActivity$$ExternalSyntheticLambda350(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((ChatActivity) this.f$0).lambda$pollAddOptionModeStart$480(textView, i, keyEvent);
            case 1:
                return ((ChangeUsernameActivity.InputCell) this.f$0).lambda$new$0(textView, i, keyEvent);
            case 2:
                return ((ChangeBioActivity) this.f$0).lambda$createView$1(textView, i, keyEvent);
            case 3:
                return ((ChatEditActivity) this.f$0).lambda$createView$5(textView, i, keyEvent);
            case 4:
                return ((CodeFieldContainer) this.f$0).lambda$setNumbersCount$0(textView, i, keyEvent);
            case 5:
                return ((GroupCreateActivity) this.f$0).lambda$createView$2(textView, i, keyEvent);
            case 6:
                return ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$new$1(textView, i, keyEvent);
            case 7:
                return ((LoginActivity.LoginActivityPhraseView) this.f$0).lambda$new$2(textView, i, keyEvent);
            case 8:
                return ((LoginActivity.LoginActivitySetupEmail) this.f$0).lambda$new$1(textView, i, keyEvent);
            case 9:
                return ((PasscodeActivity) this.f$0).lambda$createView$10(textView, i, keyEvent);
            case 10:
                return ((PassportActivity.PhoneConfirmationView) this.f$0).lambda$setParams$5(textView, i, keyEvent);
            case 11:
                return ((ProxySettingsActivity) this.f$0).lambda$createView$1(textView, i, keyEvent);
            case 12:
                return ((SelectChatUserSheet) this.f$0).lambda$new$0(textView, i, keyEvent);
            default:
                return ((TwoStepVerificationActivity) this.f$0).lambda$createView$2(textView, i, keyEvent);
        }
    }
}
