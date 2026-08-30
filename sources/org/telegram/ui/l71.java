package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l71 implements View.OnClickListener {
    public final n71 f35974a;
    public final TLRPC.TL_authorization f35975b;
    public final o71 f35976c;

    public l71(o71 o71Var, n71 n71Var, TLRPC.TL_authorization tL_authorization) {
        this.f35976c = o71Var;
        this.f35974a = n71Var;
        this.f35975b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n71 n71Var = this.f35974a;
        Switch r02 = n71Var.d;
        r02.c(!r02.h, true);
        this.f35975b.call_requests_disabled = !n71Var.d.h;
        o71.n(this.f35976c);
    }
}
