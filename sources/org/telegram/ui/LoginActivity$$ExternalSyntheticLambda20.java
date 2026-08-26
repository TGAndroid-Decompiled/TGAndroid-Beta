package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$$ExternalSyntheticLambda20 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity f$0;
    public final TLRPC.auth_SentCode f$1;
    public final Bundle f$2;
    public final boolean f$3;

    public LoginActivity$$ExternalSyntheticLambda20(int i, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, LoginActivity loginActivity, boolean z) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
        this.f$1 = auth_sentcode;
        this.f$2 = bundle;
        this.f$3 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillNextCodeParams$23(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$fillNextCodeParams$27(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
        }
    }
}
