package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityNewPasswordView f$0;
    public final String f$1;
    public final String f$2;

    public LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda6(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityNewPasswordView;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView = this.f$0;
                loginActivityNewPasswordView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7(loginActivityNewPasswordView, tL_error, this.f$1, this.f$2, tLObject));
                break;
            default:
                LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView2 = this.f$0;
                loginActivityNewPasswordView2.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda7(loginActivityNewPasswordView2, tL_error, tLObject, this.f$1, this.f$2));
                break;
        }
    }
}
