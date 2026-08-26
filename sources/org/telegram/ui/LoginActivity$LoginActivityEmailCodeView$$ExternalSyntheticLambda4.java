package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 1;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final String f$3;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = tL_error;
        this.f$3 = str;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$20(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$onNextPressed$22(this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = str;
    }
}
