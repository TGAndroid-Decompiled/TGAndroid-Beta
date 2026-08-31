package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ed0 implements OnSuccessListener {
    public final int f36481a = 0;
    public final og0 f36482b;
    public final String f36483c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f36484e;
    public final boolean f36485f;

    public ed0(og0 og0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.f36482b = og0Var;
        this.f36484e = bundle;
        this.d = auth_sentcode;
        this.f36483c = str;
        this.f36485f = z4;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36481a) {
            case 0:
                og0.X(this.f36482b, this.f36484e, this.d, this.f36483c, this.f36485f, (IntegrityTokenResponse) obj);
                return;
            default:
                og0.V(this.f36482b, this.f36483c, this.d, this.f36484e, this.f36485f, (a8.d) obj);
                return;
        }
    }

    public ed0(og0 og0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.f36482b = og0Var;
        this.f36483c = str;
        this.d = auth_sentcode;
        this.f36484e = bundle;
        this.f36485f = z4;
    }
}
