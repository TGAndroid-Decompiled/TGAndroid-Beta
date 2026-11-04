package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qa0 implements OnSuccessListener {
    public final int f48823a = 0;
    public final xd0 f48824b;
    public final String f48825c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f48826e;
    public final boolean f48827f;

    public qa0(xd0 xd0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f48824b = xd0Var;
        this.f48826e = bundle;
        this.d = auth_sentcode;
        this.f48825c = str;
        this.f48827f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f48823a) {
            case 0:
                xd0.a0(this.f48824b, this.f48826e, this.d, this.f48825c, this.f48827f, (IntegrityTokenResponse) obj);
                return;
            default:
                xd0.c0(this.f48824b, this.f48825c, this.d, this.f48826e, this.f48827f, (o8.d) obj);
                return;
        }
    }

    public qa0(xd0 xd0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f48824b = xd0Var;
        this.f48825c = str;
        this.d = auth_sentcode;
        this.f48826e = bundle;
        this.f48827f = z10;
    }
}
