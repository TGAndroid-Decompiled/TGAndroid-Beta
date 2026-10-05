package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f37664a = 0;
    public final ug0 f37665b;
    public final String f37666c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f37667e;
    public final boolean f37668f;

    public jd0(ug0 ug0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f37665b = ug0Var;
        this.f37667e = bundle;
        this.d = auth_sentcode;
        this.f37666c = str;
        this.f37668f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f37664a) {
            case 0:
                ug0.W(this.f37665b, this.f37667e, this.d, this.f37666c, this.f37668f, (IntegrityTokenResponse) obj);
                return;
            default:
                ug0.T(this.f37665b, this.f37666c, this.d, this.f37667e, this.f37668f, (m8.d) obj);
                return;
        }
    }

    public jd0(ug0 ug0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f37665b = ug0Var;
        this.f37666c = str;
        this.d = auth_sentcode;
        this.f37667e = bundle;
        this.f37668f = z10;
    }
}
