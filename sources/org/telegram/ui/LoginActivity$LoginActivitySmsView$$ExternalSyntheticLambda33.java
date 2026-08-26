package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivitySmsView f$0;
    public final Bundle f$1;

    public LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33(LoginActivity.LoginActivitySmsView loginActivitySmsView, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivitySmsView;
        this.f$1 = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$resendCode$11(this.f$1, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$new$4(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
