package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f34656a = 0;
    public final xg0 f34657b;
    public final String f34658c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f34659f;

    public ld0(xg0 xg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f34657b = xg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f34658c = str;
        this.f34659f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f34656a) {
            case 0:
                xg0.X(this.f34657b, this.e, this.d, this.f34658c, this.f34659f, (IntegrityTokenResponse) obj);
                return;
            default:
                xg0.V(this.f34657b, this.f34658c, this.d, this.e, this.f34659f, (m8.d) obj);
                return;
        }
    }

    public ld0(xg0 xg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f34657b = xg0Var;
        this.f34658c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f34659f = z10;
    }
}
