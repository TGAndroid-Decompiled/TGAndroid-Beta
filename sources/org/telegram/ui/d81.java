package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d81 implements View.OnClickListener {
    public final f81 f35750a;
    public final TLRPC.TL_authorization f35751b;
    public final g81 f35752c;

    public d81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35752c = g81Var;
        this.f35750a = f81Var;
        this.f35751b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f35750a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f35751b.call_requests_disabled = !f81Var.d.h;
        g81.n(this.f35752c);
    }
}
