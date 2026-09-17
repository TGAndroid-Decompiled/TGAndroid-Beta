package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class nd0 implements OnSuccessListener {
    public final int f36069a = 0;
    public final yg0 f36070b;
    public final String f36071c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f36072f;

    public nd0(yg0 yg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f36070b = yg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f36071c = str;
        this.f36072f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36069a) {
            case 0:
                yg0.X(this.f36070b, this.e, this.d, this.f36071c, this.f36072f, (IntegrityTokenResponse) obj);
                return;
            default:
                yg0.V(this.f36070b, this.f36071c, this.d, this.e, this.f36072f, (m8.d) obj);
                return;
        }
    }

    public nd0(yg0 yg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f36070b = yg0Var;
        this.f36071c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f36072f = z10;
    }
}
