package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class ld0 implements OnSuccessListener {
    public final int f39708a = 0;
    public final xg0 f39709b;
    public final String f39710c;
    public final TLRPC.auth_SentCode d;
    public final Bundle f39711e;
    public final boolean f39712f;

    public ld0(xg0 xg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f39709b = xg0Var;
        this.f39711e = bundle;
        this.d = auth_sentcode;
        this.f39710c = str;
        this.f39712f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f39708a) {
            case 0:
                xg0.X(this.f39709b, this.f39711e, this.d, this.f39710c, this.f39712f, (IntegrityTokenResponse) obj);
                return;
            default:
                xg0.V(this.f39709b, this.f39710c, this.d, this.f39711e, this.f39712f, (m8.d) obj);
                return;
        }
    }

    public ld0(xg0 xg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f39709b = xg0Var;
        this.f39710c = str;
        this.d = auth_sentcode;
        this.f39711e = bundle;
        this.f39712f = z10;
    }
}
