package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class c81 implements View.OnClickListener {
    public final e81 f32698a;
    public final TLRPC.TL_authorization f32699b;
    public final f81 f32700c;

    public c81(f81 f81Var, e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32700c = f81Var;
        this.f32698a = e81Var;
        this.f32699b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        e81 e81Var = this.f32698a;
        Switch r02 = e81Var.d;
        r02.c(!r02.h, true);
        this.f32699b.call_requests_disabled = !e81Var.d.h;
        f81.n(this.f32700c);
    }
}
