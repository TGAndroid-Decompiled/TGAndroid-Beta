package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qc0 implements OnSuccessListener {
    public final int f40542a = 0;
    public final dg0 f40543b;
    public final String f40544c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f40545f;

    public qc0(dg0 dg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f40543b = dg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f40544c = str;
        this.f40545f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f40542a) {
            case 0:
                dg0.X(this.f40543b, this.e, this.d, this.f40544c, this.f40545f, (IntegrityTokenResponse) obj);
                return;
            default:
                dg0.V(this.f40543b, this.f40544c, this.d, this.e, this.f40545f, (m8.d) obj);
                return;
        }
    }

    public qc0(dg0 dg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f40543b = dg0Var;
        this.f40544c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f40545f = z10;
    }
}
