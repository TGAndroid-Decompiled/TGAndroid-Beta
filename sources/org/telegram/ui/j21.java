package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f46796a;
    public final TLRPC.TL_authorization f46797b;
    public final l21 f46798c;

    public j21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f46798c = l21Var;
        this.f46796a = egVar;
        this.f46797b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f46796a;
        Switch r02 = (Switch) egVar.f33237f;
        r02.c(!r02.h, true);
        this.f46797b.call_requests_disabled = !((Switch) egVar.f33237f).h;
        l21.J0(this.f46798c);
    }
}
