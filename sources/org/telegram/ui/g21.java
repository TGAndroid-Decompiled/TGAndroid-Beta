package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class g21 implements View.OnClickListener {
    public final org.telegram.ui.Components.kg f47274a;
    public final TLRPC.TL_authorization f47275b;
    public final i21 f47276c;

    public g21(i21 i21Var, org.telegram.ui.Components.kg kgVar, TLRPC.TL_authorization tL_authorization) {
        this.f47276c = i21Var;
        this.f47274a = kgVar;
        this.f47275b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kg kgVar = this.f47274a;
        Switch r02 = (Switch) kgVar.f36407f;
        r02.c(!r02.h, true);
        this.f47275b.call_requests_disabled = !((Switch) kgVar.f36407f).h;
        i21.J0(this.f47276c);
    }
}
