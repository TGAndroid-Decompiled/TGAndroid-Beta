package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k81 implements View.OnClickListener {
    public final n81 f37326a;
    public final TLRPC.TL_authorization f37327b;
    public final o81 f37328c;

    public k81(o81 o81Var, n81 n81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37328c = o81Var;
        this.f37326a = n81Var;
        this.f37327b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n81 n81Var = this.f37326a;
        Switch r02 = n81Var.d;
        r02.c(!r02.h, true);
        this.f37327b.encrypted_requests_disabled = !n81Var.d.h;
        o81.o(this.f37328c);
    }
}
