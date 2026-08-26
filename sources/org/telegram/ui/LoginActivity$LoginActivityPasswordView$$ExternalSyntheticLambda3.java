package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPasswordView f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3(LoginActivity.LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPasswordView;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$3(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$onNextPressed$7(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onNextPressed$10(this.f$1, this.f$2);
                break;
        }
    }
}
