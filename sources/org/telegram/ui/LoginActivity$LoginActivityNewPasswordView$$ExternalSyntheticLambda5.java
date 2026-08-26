package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId = 0;
    public final LoginActivity.LoginActivityNewPasswordView f$0;
    public final TLRPC.TL_error f$1;
    public final String f$2;
    public final String f$3;
    public final TLObject f$4;

    public LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
        this.f$0 = loginActivityNewPasswordView;
        this.f$1 = tL_error;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$4 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$recoverPassword$7(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$recoverPassword$4(this.f$1, this.f$4, this.f$2, this.f$3);
                break;
        }
    }

    public LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
        this.f$0 = loginActivityNewPasswordView;
        this.f$1 = tL_error;
        this.f$4 = tLObject;
        this.f$2 = str;
        this.f$3 = str2;
    }
}
