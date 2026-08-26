package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final LoginActivity f$0;
    public final Bundle f$1;
    public final TLRPC.auth_SentCode f$2;
    public final boolean f$3;

    public LoginActivity$$ExternalSyntheticLambda21(int i, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, LoginActivity loginActivity, boolean z) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
        this.f$1 = bundle;
        this.f$2 = auth_sentcode;
        this.f$3 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$fillNextCodeParams$26(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$fillNextCodeParams$22(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
