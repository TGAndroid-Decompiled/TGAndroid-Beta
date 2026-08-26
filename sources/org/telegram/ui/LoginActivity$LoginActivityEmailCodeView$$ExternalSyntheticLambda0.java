package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final String f$1;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = this.f$0;
                loginActivityEmailCodeView.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11(loginActivityEmailCodeView, tL_error, this.f$1, tLObject));
                break;
            default:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView2 = this.f$0;
                loginActivityEmailCodeView2.getClass();
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda11(loginActivityEmailCodeView2, tL_error, tLObject, this.f$1));
                break;
        }
    }
}
