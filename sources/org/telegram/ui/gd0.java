package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class gd0 implements OnSuccessListener {
    public final int f33527a = 0;
    public final rg0 f33528b;
    public final String f33529c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f33530f;

    public gd0(rg0 rg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f33528b = rg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f33529c = str;
        this.f33530f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f33527a) {
            case 0:
                rg0.X(this.f33528b, this.e, this.d, this.f33529c, this.f33530f, (IntegrityTokenResponse) obj);
                return;
            default:
                rg0.V(this.f33528b, this.f33529c, this.d, this.e, this.f33530f, (m8.d) obj);
                return;
        }
    }

    public gd0(rg0 rg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f33528b = rg0Var;
        this.f33529c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f33530f = z10;
    }
}
