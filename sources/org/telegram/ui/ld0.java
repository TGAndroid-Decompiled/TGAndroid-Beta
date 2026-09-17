package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f38332a = 0;
    public final wg0 f38333b;
    public final String f38334c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f38335e;
    public final boolean f38336f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38333b = wg0Var;
        this.f38335e = bundle;
        this.d = auth_sentcode;
        this.f38334c = str;
        this.f38336f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38332a) {
            case 0:
                wg0.X(this.f38333b, this.f38335e, this.d, this.f38334c, this.f38336f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f38333b, this.f38334c, this.d, this.f38335e, this.f38336f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38333b = wg0Var;
        this.f38334c = str;
        this.d = auth_sentcode;
        this.f38335e = bundle;
        this.f38336f = z10;
    }
}
