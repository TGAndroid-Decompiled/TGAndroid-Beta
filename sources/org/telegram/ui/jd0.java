package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class jd0 implements OnSuccessListener {
    public final int f38986a = 0;
    public final vg0 f38987b;
    public final String f38988c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f38989e;
    public final boolean f38990f;

    public jd0(vg0 vg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f38987b = vg0Var;
        this.f38989e = bundle;
        this.d = auth_sentcode;
        this.f38988c = str;
        this.f38990f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f38986a) {
            case 0:
                vg0.X(this.f38987b, this.f38989e, this.d, this.f38988c, this.f38990f, (IntegrityTokenResponse) obj);
                return;
            default:
                vg0.V(this.f38987b, this.f38988c, this.d, this.f38989e, this.f38990f, (m8.d) obj);
                return;
        }
    }

    public jd0(vg0 vg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f38987b = vg0Var;
        this.f38988c = str;
        this.d = auth_sentcode;
        this.f38989e = bundle;
        this.f38990f = z10;
    }
}
