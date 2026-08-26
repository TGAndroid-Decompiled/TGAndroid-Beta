package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;
    public final TLRPC.TL_auth_signIn f$3;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda20(LoginActivity.LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
        this.f$3 = tL_auth_signIn;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$33(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$onNextPressed$36(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
