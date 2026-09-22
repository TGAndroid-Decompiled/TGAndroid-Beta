package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class nd0 implements OnSuccessListener {
    public final int f36007a = 0;
    public final yg0 f36008b;
    public final String f36009c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f36010f;

    public nd0(yg0 yg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f36008b = yg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f36009c = str;
        this.f36010f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36007a) {
            case 0:
                yg0.X(this.f36008b, this.e, this.d, this.f36009c, this.f36010f, (IntegrityTokenResponse) obj);
                return;
            default:
                yg0.V(this.f36008b, this.f36009c, this.d, this.e, this.f36010f, (m8.d) obj);
                return;
        }
    }

    public nd0(yg0 yg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f36008b = yg0Var;
        this.f36009c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f36010f = z10;
    }
}
