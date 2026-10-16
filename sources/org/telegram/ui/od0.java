package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class od0 implements OnSuccessListener {
    public final int f38620a = 0;
    public final ah0 f38621b;
    public final String f38622c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f38623f;

    public od0(ah0 ah0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38621b = ah0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f38622c = str;
        this.f38623f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38620a) {
            case 0:
                ah0.X(this.f38621b, this.e, this.d, this.f38622c, this.f38623f, (IntegrityTokenResponse) obj);
                return;
            default:
                ah0.V(this.f38621b, this.f38622c, this.d, this.e, this.f38623f, (m8.d) obj);
                return;
        }
    }

    public od0(ah0 ah0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38621b = ah0Var;
        this.f38622c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f38623f = z10;
    }
}
