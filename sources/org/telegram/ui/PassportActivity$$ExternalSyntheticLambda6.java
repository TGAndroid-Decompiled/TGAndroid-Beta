package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;

public final class PassportActivity$$ExternalSyntheticLambda6 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda6(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$createEmailInterface$25(textView, i, keyEvent);
            case 1:
                return this.f$0.lambda$createPhoneInterface$30(textView, i, keyEvent);
            case 2:
                return this.f$0.lambda$createIdentityInterface$52(textView, i, keyEvent);
            case 3:
                return this.f$0.lambda$createIdentityInterface$53(textView, i, keyEvent);
            case 4:
                return this.f$0.lambda$createAddressInterface$36(textView, i, keyEvent);
            case 5:
                return this.f$0.lambda$createPasswordInterface$7(textView, i, keyEvent);
            default:
                return this.f$0.lambda$createEmailVerificationInterface$5(textView, i, keyEvent);
        }
    }
}
