package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class dd0 implements OnSuccessListener {
    public final int f33594a = 0;
    public final ng0 f33595b;
    public final String f33596c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f33597f;

    public dd0(ng0 ng0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.f33595b = ng0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f33596c = str;
        this.f33597f = z4;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f33594a) {
            case 0:
                ng0.X(this.f33595b, this.e, this.d, this.f33596c, this.f33597f, (IntegrityTokenResponse) obj);
                return;
            default:
                ng0.V(this.f33595b, this.f33596c, this.d, this.e, this.f33597f, (a8.d) obj);
                return;
        }
    }

    public dd0(ng0 ng0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.f33595b = ng0Var;
        this.f33596c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f33597f = z4;
    }
}
