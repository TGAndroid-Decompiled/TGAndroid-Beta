package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f47452a;
    public final TLRPC.TL_authorization f47453b;
    public final n21 f47454c;

    public l21(n21 n21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f47454c = n21Var;
        this.f47452a = egVar;
        this.f47453b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f47452a;
        Switch r02 = (Switch) egVar.f33382f;
        r02.c(!r02.h, true);
        this.f47453b.call_requests_disabled = !((Switch) egVar.f33382f).h;
        n21.J0(this.f47454c);
    }
}
