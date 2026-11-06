package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f46819a;
    public final TLRPC.TL_authorization f46820b;
    public final l21 f46821c;

    public j21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f46821c = l21Var;
        this.f46819a = egVar;
        this.f46820b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f46819a;
        Switch r02 = (Switch) egVar.f33252f;
        r02.c(!r02.h, true);
        this.f46820b.call_requests_disabled = !((Switch) egVar.f33252f).h;
        l21.J0(this.f46821c);
    }
}
