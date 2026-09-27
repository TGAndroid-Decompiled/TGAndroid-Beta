package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class id0 implements OnSuccessListener {
    public final int f34444a = 0;
    public final tg0 f34445b;
    public final String f34446c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f34447f;

    public id0(tg0 tg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f34445b = tg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f34446c = str;
        this.f34447f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f34444a) {
            case 0:
                tg0.X(this.f34445b, this.e, this.d, this.f34446c, this.f34447f, (IntegrityTokenResponse) obj);
                return;
            default:
                tg0.V(this.f34445b, this.f34446c, this.d, this.e, this.f34447f, (m8.d) obj);
                return;
        }
    }

    public id0(tg0 tg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f34445b = tg0Var;
        this.f34446c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f34447f = z10;
    }
}
