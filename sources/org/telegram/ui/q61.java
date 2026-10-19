package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class q61 implements View.OnClickListener {
    public final t61 f40490a;
    public final TLRPC.TL_authorization f40491b;
    public final u61 f40492c;

    public q61(u61 u61Var, t61 t61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40492c = u61Var;
        this.f40490a = t61Var;
        this.f40491b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        t61 t61Var = this.f40490a;
        Switch r02 = t61Var.d;
        r02.c(!r02.h, true);
        this.f40491b.encrypted_requests_disabled = !t61Var.d.h;
        u61.o(this.f40492c);
    }
}
