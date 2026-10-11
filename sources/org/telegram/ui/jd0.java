package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f39020a = 0;
    public final vg0 f39021b;
    public final String f39022c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f39023e;
    public final boolean f39024f;

    public jd0(vg0 vg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39021b = vg0Var;
        this.f39023e = bundle;
        this.d = auth_sentcode;
        this.f39022c = str;
        this.f39024f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39020a) {
            case 0:
                vg0.X(this.f39021b, this.f39023e, this.d, this.f39022c, this.f39024f, (IntegrityTokenResponse) obj);
                return;
            default:
                vg0.V(this.f39021b, this.f39022c, this.d, this.f39023e, this.f39024f, (m8.d) obj);
                return;
        }
    }

    public jd0(vg0 vg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39021b = vg0Var;
        this.f39022c = str;
        this.d = auth_sentcode;
        this.f39023e = bundle;
        this.f39024f = z10;
    }
}
