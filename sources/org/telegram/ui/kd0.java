package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class kd0 implements OnSuccessListener {
    public final int f39268a = 0;
    public final wg0 f39269b;
    public final String f39270c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f39271e;
    public final boolean f39272f;

    public kd0(wg0 wg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39269b = wg0Var;
        this.f39271e = bundle;
        this.d = auth_sentcode;
        this.f39270c = str;
        this.f39272f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39268a) {
            case 0:
                wg0.X(this.f39269b, this.f39271e, this.d, this.f39270c, this.f39272f, (IntegrityTokenResponse) obj);
                return;
            default:
                wg0.V(this.f39269b, this.f39270c, this.d, this.f39271e, this.f39272f, (m8.d) obj);
                return;
        }
    }

    public kd0(wg0 wg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39269b = wg0Var;
        this.f39270c = str;
        this.d = auth_sentcode;
        this.f39271e = bundle;
        this.f39272f = z10;
    }
}
