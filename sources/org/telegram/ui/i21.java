package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class i21 implements View.OnClickListener {
    public final org.telegram.ui.Components.eg f46555a;
    public final TLRPC.TL_authorization f46556b;
    public final l21 f46557c;

    public i21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.f46557c = l21Var;
        this.f46555a = egVar;
        this.f46556b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.eg egVar = this.f46555a;
        Switch r02 = (Switch) egVar.f33252f;
        r02.c(!r02.h, true);
        this.f46556b.encrypted_requests_disabled = !((Switch) egVar.f33252f).h;
        l21.J0(this.f46557c);
    }
}
