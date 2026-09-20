package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class c81 implements View.OnClickListener {
    public final f81 f32666a;
    public final TLRPC.TL_authorization f32667b;
    public final g81 f32668c;

    public c81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32668c = g81Var;
        this.f32666a = f81Var;
        this.f32667b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        f81 f81Var = this.f32666a;
        Switch r02 = f81Var.d;
        r02.c(!r02.h, true);
        this.f32667b.encrypted_requests_disabled = !f81Var.d.h;
        g81.n(this.f32668c);
    }
}
