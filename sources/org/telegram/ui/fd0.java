package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class fd0 implements OnSuccessListener {
    public final int f33724a = 0;
    public final qg0 f33725b;
    public final String f33726c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f33727f;

    public fd0(qg0 qg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f33725b = qg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f33726c = str;
        this.f33727f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f33724a) {
            case 0:
                qg0.X(this.f33725b, this.e, this.d, this.f33726c, this.f33727f, (IntegrityTokenResponse) obj);
                return;
            default:
                qg0.V(this.f33725b, this.f33726c, this.d, this.e, this.f33727f, (m8.d) obj);
                return;
        }
    }

    public fd0(qg0 qg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f33725b = qg0Var;
        this.f33726c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f33727f = z10;
    }
}
