package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements OnSuccessListener {
    public final int f39388a = 0;
    public final bh0 f39389b;
    public final String f39390c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f39391f;

    public qd0(bh0 bh0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39389b = bh0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f39390c = str;
        this.f39391f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39388a) {
            case 0:
                bh0.X(this.f39389b, this.e, this.d, this.f39390c, this.f39391f, (IntegrityTokenResponse) obj);
                return;
            default:
                bh0.V(this.f39389b, this.f39390c, this.d, this.e, this.f39391f, (m8.d) obj);
                return;
        }
    }

    public qd0(bh0 bh0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39389b = bh0Var;
        this.f39390c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f39391f = z10;
    }
}
