package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f37650a = 0;
    public final ug0 f37651b;
    public final String f37652c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f37653e;
    public final boolean f37654f;

    public jd0(ug0 ug0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f37651b = ug0Var;
        this.f37653e = bundle;
        this.d = auth_sentcode;
        this.f37652c = str;
        this.f37654f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f37650a) {
            case 0:
                ug0.W(this.f37651b, this.f37653e, this.d, this.f37652c, this.f37654f, (IntegrityTokenResponse) obj);
                return;
            default:
                ug0.T(this.f37651b, this.f37652c, this.d, this.f37653e, this.f37654f, (m8.d) obj);
                return;
        }
    }

    public jd0(ug0 ug0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f37651b = ug0Var;
        this.f37652c = str;
        this.d = auth_sentcode;
        this.f37653e = bundle;
        this.f37654f = z10;
    }
}
