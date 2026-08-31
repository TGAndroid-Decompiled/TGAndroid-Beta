package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class m71 implements View.OnClickListener {
    public final o71 f38990a;
    public final TLRPC.TL_authorization f38991b;
    public final p71 f38992c;

    public m71(p71 p71Var, o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38992c = p71Var;
        this.f38990a = o71Var;
        this.f38991b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o71 o71Var = this.f38990a;
        Switch r02 = o71Var.d;
        r02.c(!r02.h, true);
        this.f38991b.call_requests_disabled = !o71Var.d.h;
        p71.n(this.f38992c);
    }
}
