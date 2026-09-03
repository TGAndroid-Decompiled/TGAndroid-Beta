package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class fd0 implements OnSuccessListener {
    public final int f34039a = 0;
    public final pg0 f34040b;
    public final String f34041c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f34042f;

    public fd0(pg0 pg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4) {
        this.f34040b = pg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f34041c = str;
        this.f34042f = z4;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f34039a) {
            case 0:
                pg0.X(this.f34040b, this.e, this.d, this.f34041c, this.f34042f, (IntegrityTokenResponse) obj);
                return;
            default:
                pg0.V(this.f34040b, this.f34041c, this.d, this.e, this.f34042f, (a8.d) obj);
                return;
        }
    }

    public fd0(pg0 pg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4) {
        this.f34040b = pg0Var;
        this.f34041c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f34042f = z4;
    }
}
