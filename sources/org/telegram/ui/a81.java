package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class a81 implements View.OnClickListener {
    public final c81 f31973a;
    public final TLRPC.TL_authorization f31974b;
    public final d81 f31975c;

    public a81(d81 d81Var, c81 c81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31975c = d81Var;
        this.f31973a = c81Var;
        this.f31974b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c81 c81Var = this.f31973a;
        Switch r02 = c81Var.d;
        r02.c(!r02.h, true);
        this.f31974b.call_requests_disabled = !c81Var.d.h;
        d81.n(this.f31975c);
    }
}
