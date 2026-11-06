package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f46820a;
    public final TLRPC.TL_authorization f46821b;
    public final l21 f46822c;

    public j21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f46822c = l21Var;
        this.f46820a = egVar;
        this.f46821b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f46820a;
        Switch r02 = (Switch) egVar.f33233f;
        r02.c(!r02.h, true);
        this.f46821b.call_requests_disabled = !((Switch) egVar.f33233f).h;
        l21.J0(this.f46822c);
    }
}
