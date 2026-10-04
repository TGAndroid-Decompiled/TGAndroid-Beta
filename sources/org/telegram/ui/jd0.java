package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f37656a = 0;
    public final ug0 f37657b;
    public final String f37658c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f37659e;
    public final boolean f37660f;

    public jd0(ug0 ug0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f37657b = ug0Var;
        this.f37659e = bundle;
        this.d = auth_sentcode;
        this.f37658c = str;
        this.f37660f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f37656a) {
            case 0:
                ug0.W(this.f37657b, this.f37659e, this.d, this.f37658c, this.f37660f, (IntegrityTokenResponse) obj);
                return;
            default:
                ug0.T(this.f37657b, this.f37658c, this.d, this.f37659e, this.f37660f, (m8.d) obj);
                return;
        }
    }

    public jd0(ug0 ug0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f37657b = ug0Var;
        this.f37658c = str;
        this.d = auth_sentcode;
        this.f37659e = bundle;
        this.f37660f = z10;
    }
}
