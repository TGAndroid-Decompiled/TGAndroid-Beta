package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class a41 implements View.OnClickListener {
    public final org.telegram.ui.Components.ag f35549a;
    public final TLRPC.TL_authorization f35550b;
    public final c41 f35551c;

    public a41(c41 c41Var, org.telegram.ui.Components.ag agVar, TLRPC.TL_authorization tL_authorization) {
        this.f35551c = c41Var;
        this.f35549a = agVar;
        this.f35550b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ag agVar = this.f35549a;
        Switch r02 = (Switch) agVar.f24410f;
        r02.c(!r02.h, true);
        this.f35550b.call_requests_disabled = !((Switch) agVar.f24410f).h;
        c41.J0(this.f35551c);
    }
}
