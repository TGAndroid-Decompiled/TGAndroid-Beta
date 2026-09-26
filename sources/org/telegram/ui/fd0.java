package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class fd0 implements OnSuccessListener {
    public final int f33638a = 0;
    public final qg0 f33639b;
    public final String f33640c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f33641f;

    public fd0(qg0 qg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f33639b = qg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f33640c = str;
        this.f33641f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f33638a) {
            case 0:
                qg0.X(this.f33639b, this.e, this.d, this.f33640c, this.f33641f, (IntegrityTokenResponse) obj);
                return;
            default:
                qg0.V(this.f33639b, this.f33640c, this.d, this.e, this.f33641f, (m8.d) obj);
                return;
        }
    }

    public fd0(qg0 qg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f33639b = qg0Var;
        this.f33640c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f33641f = z10;
    }
}
