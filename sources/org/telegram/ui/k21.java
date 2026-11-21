package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f49174a;
    public final TLRPC.TL_authorization f49175b;
    public final n21 f49176c;

    public k21(n21 n21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49176c = n21Var;
        this.f49174a = vgVar;
        this.f49175b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f49174a;
        Switch r02 = (Switch) vgVar.f40821f;
        r02.c(!r02.h, true);
        this.f49175b.encrypted_requests_disabled = !((Switch) vgVar.f40821f).h;
        n21.K0(this.f49176c);
    }
}
