package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l81 implements View.OnClickListener {
    public final n81 f37657a;
    public final TLRPC.TL_authorization f37658b;
    public final o81 f37659c;

    public l81(o81 o81Var, n81 n81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37659c = o81Var;
        this.f37657a = n81Var;
        this.f37658b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n81 n81Var = this.f37657a;
        Switch r02 = n81Var.d;
        r02.c(!r02.h, true);
        this.f37658b.call_requests_disabled = !n81Var.d.h;
        o81.o(this.f37659c);
    }
}
