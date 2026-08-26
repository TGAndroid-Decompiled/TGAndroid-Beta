package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final Bundle f$1;
    public final TLRPC.TL_auth_resetLoginEmail f$2;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = bundle;
        this.f$2 = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestEmailReset$13(this.f$1, this.f$2, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$new$5(this.f$1, this.f$2, tLObject, tL_error);
                break;
        }
    }
}
