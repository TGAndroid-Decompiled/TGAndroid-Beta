package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class b81 implements View.OnClickListener {
    public final d81 f32077a;
    public final TLRPC.TL_authorization f32078b;
    public final e81 f32079c;

    public b81(e81 e81Var, d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32079c = e81Var;
        this.f32077a = d81Var;
        this.f32078b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        d81 d81Var = this.f32077a;
        Switch r02 = d81Var.d;
        r02.c(!r02.h, true);
        this.f32078b.call_requests_disabled = !d81Var.d.h;
        e81.n(this.f32079c);
    }
}
