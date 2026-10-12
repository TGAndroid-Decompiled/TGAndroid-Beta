package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f39702a = 0;
    public final xg0 f39703b;
    public final String f39704c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f39705e;
    public final boolean f39706f;

    public ld0(xg0 xg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39703b = xg0Var;
        this.f39705e = bundle;
        this.d = auth_sentcode;
        this.f39704c = str;
        this.f39706f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39702a) {
            case 0:
                xg0.X(this.f39703b, this.f39705e, this.d, this.f39704c, this.f39706f, (IntegrityTokenResponse) obj);
                return;
            default:
                xg0.V(this.f39703b, this.f39704c, this.d, this.f39705e, this.f39706f, (m8.d) obj);
                return;
        }
    }

    public ld0(xg0 xg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39703b = xg0Var;
        this.f39704c = str;
        this.d = auth_sentcode;
        this.f39705e = bundle;
        this.f39706f = z10;
    }
}
