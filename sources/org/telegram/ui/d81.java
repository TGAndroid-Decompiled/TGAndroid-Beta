package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d81 implements View.OnClickListener {
    public final f81 f36949a;
    public final TLRPC.TL_authorization f36950b;
    public final g81 f36951c;

    public d81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36951c = g81Var;
        this.f36949a = f81Var;
        this.f36950b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f36949a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f36950b.call_requests_disabled = !f81Var.d.h;
        g81.p(this.f36951c);
    }
}
