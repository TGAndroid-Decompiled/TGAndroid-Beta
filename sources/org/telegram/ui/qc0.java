package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qc0 implements OnSuccessListener {
    public final int f40533a = 0;
    public final dg0 f40534b;
    public final String f40535c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f40536f;

    public qc0(dg0 dg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f40534b = dg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f40535c = str;
        this.f40536f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f40533a) {
            case 0:
                dg0.X(this.f40534b, this.e, this.d, this.f40535c, this.f40536f, (IntegrityTokenResponse) obj);
                return;
            default:
                dg0.V(this.f40534b, this.f40535c, this.d, this.e, this.f40536f, (m8.d) obj);
                return;
        }
    }

    public qc0(dg0 dg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f40534b = dg0Var;
        this.f40535c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f40536f = z10;
    }
}
