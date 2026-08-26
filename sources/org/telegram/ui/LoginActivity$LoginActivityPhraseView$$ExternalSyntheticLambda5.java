package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId = 1;
    public final LoginActivity.LoginActivityPhraseView f$0;
    public final TLRPC.TL_error f$1;
    public final Bundle f$2;
    public final TLObject f$3;

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.f$0 = loginActivityPhraseView;
        this.f$3 = tLObject;
        this.f$2 = bundle;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resendCode$14(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$new$4(this.f$3, this.f$2, this.f$1);
                break;
        }
    }

    public LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.f$0 = loginActivityPhraseView;
        this.f$1 = tL_error;
        this.f$2 = bundle;
        this.f$3 = tLObject;
    }
}
