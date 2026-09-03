package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ed0 implements OnSuccessListener {
    public final int f36445a = 0;
    public final og0 f36446b;
    public final String f36447c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f36448e;
    public final boolean f36449f;

    public ed0(og0 og0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.f36446b = og0Var;
        this.f36448e = bundle;
        this.d = auth_sentcode;
        this.f36447c = str;
        this.f36449f = z4;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36445a) {
            case 0:
                og0.X(this.f36446b, this.f36448e, this.d, this.f36447c, this.f36449f, (IntegrityTokenResponse) obj);
                return;
            default:
                og0.V(this.f36446b, this.f36447c, this.d, this.f36448e, this.f36449f, (a8.d) obj);
                return;
        }
    }

    public ed0(og0 og0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.f36446b = og0Var;
        this.f36447c = str;
        this.d = auth_sentcode;
        this.f36448e = bundle;
        this.f36449f = z4;
    }
}
