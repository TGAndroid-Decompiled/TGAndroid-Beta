package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f37651a = 0;
    public final ug0 f37652b;
    public final String f37653c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f37654e;
    public final boolean f37655f;

    public jd0(ug0 ug0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f37652b = ug0Var;
        this.f37654e = bundle;
        this.d = auth_sentcode;
        this.f37653c = str;
        this.f37655f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f37651a) {
            case 0:
                ug0.W(this.f37652b, this.f37654e, this.d, this.f37653c, this.f37655f, (IntegrityTokenResponse) obj);
                return;
            default:
                ug0.T(this.f37652b, this.f37653c, this.d, this.f37654e, this.f37655f, (m8.d) obj);
                return;
        }
    }

    public jd0(ug0 ug0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f37652b = ug0Var;
        this.f37653c = str;
        this.d = auth_sentcode;
        this.f37654e = bundle;
        this.f37655f = z10;
    }
}
