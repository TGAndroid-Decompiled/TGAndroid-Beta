package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l21 implements View.OnClickListener {
    public final org.telegram.ui.Components.dg f47492a;
    public final TLRPC.TL_authorization f47493b;
    public final o21 f47494c;

    public l21(o21 o21Var, org.telegram.ui.Components.dg dgVar, TLRPC.TL_authorization tL_authorization) {
        this.f47494c = o21Var;
        this.f47492a = dgVar;
        this.f47493b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.dg dgVar = this.f47492a;
        Switch r02 = (Switch) dgVar.f32967f;
        r02.c(!r02.h, true);
        this.f47493b.encrypted_requests_disabled = !((Switch) dgVar.f32967f).h;
        o21.J0(this.f47494c);
    }
}
