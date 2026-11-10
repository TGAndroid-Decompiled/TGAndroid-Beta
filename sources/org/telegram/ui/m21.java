package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class m21 implements View.OnClickListener {
    public final org.telegram.ui.Components.dg f47780a;
    public final TLRPC.TL_authorization f47781b;
    public final o21 f47782c;

    public m21(o21 o21Var, org.telegram.ui.Components.dg dgVar, TLRPC.TL_authorization tL_authorization) {
        this.f47782c = o21Var;
        this.f47780a = dgVar;
        this.f47781b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.dg dgVar = this.f47780a;
        Switch r02 = (Switch) dgVar.f32967f;
        r02.c(!r02.h, true);
        this.f47781b.call_requests_disabled = !((Switch) dgVar.f32967f).h;
        o21.J0(this.f47782c);
    }
}
