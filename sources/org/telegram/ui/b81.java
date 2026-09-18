package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class b81 implements View.OnClickListener {
    public final e81 f32073a;
    public final TLRPC.TL_authorization f32074b;
    public final f81 f32075c;

    public b81(f81 f81Var, e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32075c = f81Var;
        this.f32073a = e81Var;
        this.f32074b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        e81 e81Var = this.f32073a;
        Switch r02 = e81Var.d;
        r02.c(!r02.h, true);
        this.f32074b.encrypted_requests_disabled = !e81Var.d.h;
        f81.n(this.f32075c);
    }
}
