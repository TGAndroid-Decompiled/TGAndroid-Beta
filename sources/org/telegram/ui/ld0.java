package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f38305a = 0;
    public final wg0 f38306b;
    public final String f38307c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f38308e;
    public final boolean f38309f;

    public ld0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38306b = wg0Var;
        this.f38308e = bundle;
        this.d = auth_sentcode;
        this.f38307c = str;
        this.f38309f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38305a) {
            case 0:
                wg0.X(this.f38306b, this.f38308e, this.d, this.f38307c, this.f38309f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f38306b, this.f38307c, this.d, this.f38308e, this.f38309f, (m8.d) obj);
                return;
        }
    }

    public ld0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38306b = wg0Var;
        this.f38307c = str;
        this.d = auth_sentcode;
        this.f38308e = bundle;
        this.f38309f = z10;
    }
}
