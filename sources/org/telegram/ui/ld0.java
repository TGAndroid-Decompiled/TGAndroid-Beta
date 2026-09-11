package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f38304a = 0;
    public final wg0 f38305b;
    public final String f38306c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f38307e;
    public final boolean f38308f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38305b = wg0Var;
        this.f38307e = bundle;
        this.d = auth_sentcode;
        this.f38306c = str;
        this.f38308f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38304a) {
            case 0:
                wg0.X(this.f38305b, this.f38307e, this.d, this.f38306c, this.f38308f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f38305b, this.f38306c, this.d, this.f38307e, this.f38308f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38305b = wg0Var;
        this.f38306c = str;
        this.d = auth_sentcode;
        this.f38307e = bundle;
        this.f38308f = z10;
    }
}
