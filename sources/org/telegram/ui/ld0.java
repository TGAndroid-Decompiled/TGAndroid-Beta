package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f35439a = 0;
    public final wg0 f35440b;
    public final String f35441c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f35442f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f35440b = wg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f35441c = str;
        this.f35442f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f35439a) {
            case 0:
                wg0.X(this.f35440b, this.e, this.d, this.f35441c, this.f35442f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f35440b, this.f35441c, this.d, this.e, this.f35442f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f35440b = wg0Var;
        this.f35441c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f35442f = z10;
    }
}
