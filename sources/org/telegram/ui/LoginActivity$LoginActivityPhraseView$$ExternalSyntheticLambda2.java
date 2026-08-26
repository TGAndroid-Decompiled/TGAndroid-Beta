package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPhraseView f$0;
    public final TLRPC.TL_auth_signIn f$1;

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_auth_signIn tL_auth_signIn, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPhraseView;
        this.f$1 = tL_auth_signIn;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onNextPressed$13(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$onNextPressed$10(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
