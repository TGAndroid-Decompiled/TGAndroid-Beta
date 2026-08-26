package org.telegram.ui;

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
                this.f$0.lambda$onNextPressed$23(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onNextPressed$21(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
