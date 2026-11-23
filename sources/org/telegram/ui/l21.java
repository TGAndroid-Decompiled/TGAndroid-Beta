package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class l21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f49454a;
    public final TLRPC.TL_authorization f49455b;
    public final n21 f49456c;

    public l21(n21 n21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49456c = n21Var;
        this.f49454a = vgVar;
        this.f49455b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f49454a;
        Switch r02 = (Switch) vgVar.f40822f;
        r02.c(!r02.h, true);
        this.f49455b.call_requests_disabled = !((Switch) vgVar.f40822f).h;
        n21.K0(this.f49456c);
    }
}
