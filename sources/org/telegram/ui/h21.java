package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h21 implements View.OnClickListener {
    public final TLRPC.TL_authorization f46213a;
    public final o21 f46214b;

    public h21(o21 o21Var, TLRPC.TL_authorization tL_authorization) {
        this.f46214b = o21Var;
        this.f46213a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o21.I0(this.f46214b, this.f46213a.country);
    }
}
