package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class nd0 implements OnSuccessListener {
    public final int f36074a = 0;
    public final yg0 f36075b;
    public final String f36076c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f36077f;

    public nd0(yg0 yg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f36075b = yg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f36076c = str;
        this.f36077f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36074a) {
            case 0:
                yg0.X(this.f36075b, this.e, this.d, this.f36076c, this.f36077f, (IntegrityTokenResponse) obj);
                return;
            default:
                yg0.V(this.f36075b, this.f36076c, this.d, this.e, this.f36077f, (m8.d) obj);
                return;
        }
    }

    public nd0(yg0 yg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f36075b = yg0Var;
        this.f36076c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f36077f = z10;
    }
}
