package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPasswordView f$0;

    public LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0(LoginActivity.LoginActivityPasswordView loginActivityPasswordView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPasswordView;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$4(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$onNextPressed$8(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onNextPressed$11(tLObject, tL_error);
                break;
        }
    }
}
