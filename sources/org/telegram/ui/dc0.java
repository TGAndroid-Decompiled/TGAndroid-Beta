package org.telegram.ui;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import org.telegram.tgnet.TLRPC;
public final class dc0 implements OnSuccessListener {
    public final int f36733a = 0;
    public final hf0 f36734b;
    public final String f36735c;
    public final TLRPC.auth_SentCode d;
    public final Bundle e;
    public final boolean f36736f;

    public dc0(hf0 hf0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10) {
        this.f36734b = hf0Var;
        this.e = bundle;
        this.d = auth_sentcode;
        this.f36735c = str;
        this.f36736f = z10;
    }

    @Override
    public final void onSuccess(Object obj) {
        switch (this.f36733a) {
            case 0:
                hf0.Z(this.f36734b, this.e, this.d, this.f36735c, this.f36736f, (IntegrityTokenResponse) obj);
                return;
            default:
                hf0.b0(this.f36734b, this.f36735c, this.d, this.e, this.f36736f, (m8.d) obj);
                return;
        }
    }

    public dc0(hf0 hf0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10) {
        this.f36734b = hf0Var;
        this.f36735c = str;
        this.d = auth_sentcode;
        this.e = bundle;
        this.f36736f = z10;
    }
}
