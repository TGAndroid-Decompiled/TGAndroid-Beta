package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class k21 implements View.OnClickListener {
    public final org.telegram.ui.Components.tg f49154a;
    public final TLRPC.TL_authorization f49155b;
    public final m21 f49156c;

    public k21(m21 m21Var, org.telegram.ui.Components.tg tgVar, TLRPC.TL_authorization tL_authorization) {
        this.f49156c = m21Var;
        this.f49154a = tgVar;
        this.f49155b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.tg tgVar = this.f49154a;
        Switch r02 = (Switch) tgVar.f39995f;
        r02.c(!r02.h, true);
        this.f49155b.call_requests_disabled = !((Switch) tgVar.f39995f).h;
        m21.K0(this.f49156c);
    }
}
