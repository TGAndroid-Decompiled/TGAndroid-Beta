package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class nd0 implements OnSuccessListener {
    public final int f35986a = 0;
    public final yg0 f35987b;
    public final String f35988c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f35989f;

    public nd0(yg0 yg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f35987b = yg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f35988c = str;
        this.f35989f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f35986a) {
            case 0:
                yg0.X(this.f35987b, this.e, this.d, this.f35988c, this.f35989f, (IntegrityTokenResponse) obj);
                return;
            default:
                yg0.V(this.f35987b, this.f35988c, this.d, this.e, this.f35989f, (m8.d) obj);
                return;
        }
    }

    public nd0(yg0 yg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f35987b = yg0Var;
        this.f35988c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f35989f = z10;
    }
}
