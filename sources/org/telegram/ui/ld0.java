package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f35468a = 0;
    public final wg0 f35469b;
    public final String f35470c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f35471f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f35469b = wg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f35470c = str;
        this.f35471f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f35468a) {
            case 0:
                wg0.X(this.f35469b, this.e, this.d, this.f35470c, this.f35471f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f35469b, this.f35470c, this.d, this.e, this.f35471f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f35469b = wg0Var;
        this.f35470c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f35471f = z10;
    }
}
