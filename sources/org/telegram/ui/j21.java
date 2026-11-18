package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.tg f48854a;
    public final TLRPC.TL_authorization f48855b;
    public final m21 f48856c;

    public j21(m21 m21Var, org.telegram.ui.Components.tg tgVar, TLRPC.TL_authorization tL_authorization) {
        this.f48856c = m21Var;
        this.f48854a = tgVar;
        this.f48855b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.tg tgVar = this.f48854a;
        Switch r02 = (Switch) tgVar.f39995f;
        r02.c(!r02.h, true);
        this.f48855b.encrypted_requests_disabled = !((Switch) tgVar.f39995f).h;
        m21.K0(this.f48856c);
    }
}
