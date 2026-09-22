package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class c81 implements View.OnClickListener {
    public final f81 f32686a;
    public final TLRPC.TL_authorization f32687b;
    public final g81 f32688c;

    public c81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32688c = g81Var;
        this.f32686a = f81Var;
        this.f32687b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f32686a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f32687b.encrypted_requests_disabled = !f81Var.d.h;
        g81.n(this.f32688c);
    }
}
