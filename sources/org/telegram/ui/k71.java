package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k71 implements View.OnClickListener {
    public final n71 f35586a;
    public final TLRPC.TL_authorization f35587b;
    public final o71 f35588c;

    public k71(o71 o71Var, n71 n71Var, TLRPC.TL_authorization tL_authorization) {
        this.f35588c = o71Var;
        this.f35586a = n71Var;
        this.f35587b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        n71 n71Var = this.f35586a;
        Switch r02 = n71Var.d;
        r02.c(!r02.h, true);
        this.f35587b.encrypted_requests_disabled = !n71Var.d.h;
        o71.n(this.f35588c);
    }
}
