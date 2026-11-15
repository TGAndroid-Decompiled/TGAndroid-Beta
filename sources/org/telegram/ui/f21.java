package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class f21 implements View.OnClickListener {
    public final org.telegram.ui.Components.kg f46977a;
    public final TLRPC.TL_authorization f46978b;
    public final i21 f46979c;

    public f21(i21 i21Var, org.telegram.ui.Components.kg kgVar, TLRPC.TL_authorization tL_authorization) {
        this.f46979c = i21Var;
        this.f46977a = kgVar;
        this.f46978b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.kg kgVar = this.f46977a;
        Switch r02 = (Switch) kgVar.f36419f;
        r02.c(!r02.h, true);
        this.f46978b.encrypted_requests_disabled = !((Switch) kgVar.f36419f).h;
        i21.J0(this.f46979c);
    }
}
