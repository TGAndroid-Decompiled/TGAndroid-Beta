package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class q71 implements View.OnClickListener {
    public final t71 f40360a;
    public final TLRPC.TL_authorization f40361b;
    public final u71 f40362c;

    public q71(u71 u71Var, t71 t71Var, TLRPC.TL_authorization tL_authorization) {
        this.f40362c = u71Var;
        this.f40360a = t71Var;
        this.f40361b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        t71 t71Var = this.f40360a;
        Switch r02 = t71Var.d;
        r02.c(!r02.h, true);
        this.f40361b.encrypted_requests_disabled = !t71Var.d.h;
        u71.n(this.f40362c);
    }
}
