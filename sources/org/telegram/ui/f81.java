package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class f81 implements View.OnClickListener {
    public final i81 f32716a;
    public final TLRPC.TL_authorization f32717b;
    public final j81 f32718c;

    public f81(j81 j81Var, i81 i81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32718c = j81Var;
        this.f32716a = i81Var;
        this.f32717b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        i81 i81Var = this.f32716a;
        Switch r02 = i81Var.d;
        r02.c(!r02.h, true);
        this.f32717b.encrypted_requests_disabled = !i81Var.d.h;
        j81.n(this.f32718c);
    }
}
