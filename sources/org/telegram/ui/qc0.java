package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qc0 implements OnSuccessListener {
    public final int f40539a = 0;
    public final dg0 f40540b;
    public final String f40541c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f40542f;

    public qc0(dg0 dg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f40540b = dg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f40541c = str;
        this.f40542f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f40539a) {
            case 0:
                dg0.X(this.f40540b, this.e, this.d, this.f40541c, this.f40542f, (IntegrityTokenResponse) obj);
                return;
            default:
                dg0.V(this.f40540b, this.f40541c, this.d, this.e, this.f40542f, (m8.d) obj);
                return;
        }
    }

    public qc0(dg0 dg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f40540b = dg0Var;
        this.f40541c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f40542f = z10;
    }
}
