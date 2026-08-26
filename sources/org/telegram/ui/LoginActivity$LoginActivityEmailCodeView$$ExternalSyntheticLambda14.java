package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityEmailCodeView f$0;
    public final TLObject f$1;
    public final Bundle f$2;
    public final TLRPC.TL_error f$3;
    public final TLRPC.TL_auth_resetLoginEmail f$4;

    public LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14(LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityEmailCodeView;
        this.f$1 = tLObject;
        this.f$2 = bundle;
        this.f$3 = tL_error;
        this.f$4 = tL_auth_resetLoginEmail;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$requestEmailReset$12(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                this.f$0.lambda$new$4(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
        }
    }
}
