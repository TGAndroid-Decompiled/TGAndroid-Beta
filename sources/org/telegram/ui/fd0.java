package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class fd0 implements OnSuccessListener {
    public final int f33640a = 0;
    public final qg0 f33641b;
    public final String f33642c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f33643f;

    public fd0(qg0 qg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f33641b = qg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f33642c = str;
        this.f33643f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f33640a) {
            case 0:
                qg0.X(this.f33641b, this.e, this.d, this.f33642c, this.f33643f, (IntegrityTokenResponse) obj);
                return;
            default:
                qg0.V(this.f33641b, this.f33642c, this.d, this.e, this.f33643f, (m8.d) obj);
                return;
        }
    }

    public fd0(qg0 qg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f33641b = qg0Var;
        this.f33642c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f33643f = z10;
    }
}
