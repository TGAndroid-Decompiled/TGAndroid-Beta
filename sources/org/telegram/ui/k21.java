package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f49132a;
    public final TLRPC.TL_authorization f49133b;
    public final m21 f49134c;

    public k21(m21 m21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49134c = m21Var;
        this.f49132a = vgVar;
        this.f49133b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f49132a;
        Switch r02 = (Switch) vgVar.f40773f;
        r02.c(!r02.h, true);
        this.f49133b.call_requests_disabled = !((Switch) vgVar.f40773f).h;
        m21.K0(this.f49134c);
    }
}
