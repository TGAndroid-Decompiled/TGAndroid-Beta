package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class c81 implements View.OnClickListener {
    public final f81 f36638a;
    public final TLRPC.TL_authorization f36639b;
    public final g81 f36640c;

    public c81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36640c = g81Var;
        this.f36638a = f81Var;
        this.f36639b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f36638a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f36639b.encrypted_requests_disabled = !f81Var.d.h;
        g81.p(this.f36640c);
    }
}
