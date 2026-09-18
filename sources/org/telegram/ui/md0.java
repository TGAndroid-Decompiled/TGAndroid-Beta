package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class md0 implements OnSuccessListener {
    public final int f35635a = 0;
    public final xg0 f35636b;
    public final String f35637c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f35638f;

    public md0(xg0 xg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f35636b = xg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f35637c = str;
        this.f35638f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f35635a) {
            case 0:
                xg0.X(this.f35636b, this.e, this.d, this.f35637c, this.f35638f, (IntegrityTokenResponse) obj);
                return;
            default:
                xg0.V(this.f35636b, this.f35637c, this.d, this.e, this.f35638f, (m8.d) obj);
                return;
        }
    }

    public md0(xg0 xg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f35636b = xg0Var;
        this.f35637c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f35638f = z10;
    }
}
