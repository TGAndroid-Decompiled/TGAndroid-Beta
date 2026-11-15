package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class f21 implements View.OnClickListener {
    public final org.telegram.ui.Components.kg f46961a;
    public final TLRPC.TL_authorization f46962b;
    public final i21 f46963c;

    public f21(i21 i21Var, org.telegram.ui.Components.kg kgVar, TLRPC.TL_authorization tL_authorization) {
        this.f46963c = i21Var;
        this.f46961a = kgVar;
        this.f46962b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kg kgVar = this.f46961a;
        Switch r02 = (Switch) kgVar.f36407f;
        r02.c(!r02.h, true);
        this.f46962b.encrypted_requests_disabled = !((Switch) kgVar.f36407f).h;
        i21.J0(this.f46963c);
    }
}
