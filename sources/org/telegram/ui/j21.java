package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class j21 implements View.OnClickListener {
    public final org.telegram.ui.Components.vg f48883a;
    public final TLRPC.TL_authorization f48884b;
    public final m21 f48885c;

    public j21(m21 m21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.f48885c = m21Var;
        this.f48883a = vgVar;
        this.f48884b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.vg vgVar = this.f48883a;
        Switch r02 = (Switch) vgVar.f40773f;
        r02.c(!r02.h, true);
        this.f48884b.encrypted_requests_disabled = !((Switch) vgVar.f40773f).h;
        m21.K0(this.f48885c);
    }
}
