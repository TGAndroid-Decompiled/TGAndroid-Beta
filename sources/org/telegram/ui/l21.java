package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f49450a;
    public final TLRPC.TL_authorization f49451b;
    public final n21 f49452c;

    public l21(n21 n21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49452c = n21Var;
        this.f49450a = vgVar;
        this.f49451b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f49450a;
        Switch r02 = (Switch) vgVar.f40821f;
        r02.c(!r02.h, true);
        this.f49451b.call_requests_disabled = !((Switch) vgVar.f40821f).h;
        n21.K0(this.f49452c);
    }
}
