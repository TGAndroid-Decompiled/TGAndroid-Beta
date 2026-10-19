package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class qc0 implements OnSuccessListener {
    public final int f40538a = 0;
    public final cg0 f40539b;
    public final String f40540c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f40541f;

    public qc0(cg0 cg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f40539b = cg0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f40540c = str;
        this.f40541f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f40538a) {
            case 0:
                cg0.X(this.f40539b, this.e, this.d, this.f40540c, this.f40541f, (IntegrityTokenResponse) obj);
                return;
            default:
                cg0.V(this.f40539b, this.f40540c, this.d, this.e, this.f40541f, (m8.d) obj);
                return;
        }
    }

    public qc0(cg0 cg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f40539b = cg0Var;
        this.f40540c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f40541f = z10;
    }
}
