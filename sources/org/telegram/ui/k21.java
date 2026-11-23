package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f49178a;
    public final TLRPC.TL_authorization f49179b;
    public final n21 f49180c;

    public k21(n21 n21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49180c = n21Var;
        this.f49178a = vgVar;
        this.f49179b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f49178a;
        Switch r02 = (Switch) vgVar.f40823f;
        r02.c(!r02.h, true);
        this.f49179b.encrypted_requests_disabled = !((Switch) vgVar.f40823f).h;
        n21.K0(this.f49180c);
    }
}
