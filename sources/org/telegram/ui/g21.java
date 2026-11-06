package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f45765a;
    public final l21 f45766b;

    public g21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.f45766b = l21Var;
        this.f45765a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        l21.I0(this.f45766b, this.f45765a.ip);
    }
}
