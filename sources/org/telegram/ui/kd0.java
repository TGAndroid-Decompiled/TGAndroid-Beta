package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class kd0 implements OnSuccessListener {
    public final int f39224a = 0;
    public final wg0 f39225b;
    public final String f39226c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f39227e;
    public final boolean f39228f;

    public kd0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39225b = wg0Var;
        this.f39227e = bundle;
        this.d = auth_sentcode;
        this.f39226c = str;
        this.f39228f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39224a) {
            case 0:
                wg0.X(this.f39225b, this.f39227e, this.d, this.f39226c, this.f39228f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f39225b, this.f39226c, this.d, this.f39227e, this.f39228f, (m8.d) obj);
                return;
        }
    }

    public kd0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39225b = wg0Var;
        this.f39226c = str;
        this.d = auth_sentcode;
        this.f39227e = bundle;
        this.f39228f = z10;
    }
}
