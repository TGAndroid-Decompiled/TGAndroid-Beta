package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f47163a;
    public final TLRPC.TL_authorization f47164b;
    public final n21 f47165c;

    public k21(n21 n21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f47165c = n21Var;
        this.f47163a = egVar;
        this.f47164b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f47163a;
        Switch r02 = (Switch) egVar.f33382f;
        r02.c(!r02.h, true);
        this.f47164b.encrypted_requests_disabled = !((Switch) egVar.f33382f).h;
        n21.J0(this.f47165c);
    }
}
