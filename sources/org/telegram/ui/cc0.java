package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class cc0 implements OnSuccessListener {
    public final int f36286a = 0;
    public final gf0 f36287b;
    public final String f36288c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f36289f;

    public cc0(gf0 gf0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f36287b = gf0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f36288c = str;
        this.f36289f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36286a) {
            case 0:
                gf0.a0(this.f36287b, this.e, this.d, this.f36288c, this.f36289f, (IntegrityTokenResponse) obj);
                return;
            default:
                gf0.c0(this.f36287b, this.f36288c, this.d, this.e, this.f36289f, (m8.d) obj);
                return;
        }
    }

    public cc0(gf0 gf0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f36287b = gf0Var;
        this.f36288c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f36289f = z10;
    }
}
