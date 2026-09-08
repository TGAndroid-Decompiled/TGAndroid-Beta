package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f38331a = 0;
    public final wg0 f38332b;
    public final String f38333c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f38334e;
    public final boolean f38335f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38332b = wg0Var;
        this.f38334e = bundle;
        this.d = auth_sentcode;
        this.f38333c = str;
        this.f38335f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38331a) {
            case 0:
                wg0.X(this.f38332b, this.f38334e, this.d, this.f38333c, this.f38335f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f38332b, this.f38333c, this.d, this.f38334e, this.f38335f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38332b = wg0Var;
        this.f38333c = str;
        this.d = auth_sentcode;
        this.f38334e = bundle;
        this.f38335f = z10;
    }
}
