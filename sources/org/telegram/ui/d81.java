package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d81 implements View.OnClickListener {
    public final f81 f35749a;
    public final TLRPC.TL_authorization f35750b;
    public final g81 f35751c;

    public d81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35751c = g81Var;
        this.f35749a = f81Var;
        this.f35750b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f35749a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f35750b.call_requests_disabled = !f81Var.d.h;
        g81.n(this.f35751c);
    }
}
