package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;

public final class LoginActivity$$ExternalSyntheticLambda21 implements OnSuccessListener {
    public final int $r8$classId = 0;
    public final LoginActivity f$0;
    public final Bundle f$1;
    public final TLRPC.auth_SentCode f$2;
    public final String f$3;
    public final boolean f$4;

    public LoginActivity$$ExternalSyntheticLambda21(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z) {
        this.f$0 = loginActivity;
        this.f$1 = bundle;
        this.f$2 = auth_sentcode;
        this.f$3 = str;
        this.f$4 = z;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.auth_SentCode auth_sentcode = this.f$2;
                String str = this.f$3;
                this.f$0.lambda$fillNextCodeParams$24(this.f$1, auth_sentcode, str, this.f$4, (IntegrityTokenResponse) obj);
                break;
            default:
                TLRPC.auth_SentCode auth_sentcode2 = this.f$2;
                Bundle bundle = this.f$1;
                this.f$0.lambda$fillNextCodeParams$28(this.f$3, auth_sentcode2, bundle, this.f$4, (SafetyNetApi$AttestationResponse) obj);
                break;
        }
    }

    public LoginActivity$$ExternalSyntheticLambda21(LoginActivity loginActivity, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z) {
        this.f$0 = loginActivity;
        this.f$3 = str;
        this.f$2 = auth_sentcode;
        this.f$1 = bundle;
        this.f$4 = z;
    }
}
