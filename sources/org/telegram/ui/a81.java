package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class a81 implements View.OnClickListener {
    public final d81 f31697a;
    public final TLRPC.TL_authorization f31698b;
    public final e81 f31699c;

    public a81(e81 e81Var, d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31699c = e81Var;
        this.f31697a = d81Var;
        this.f31698b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        d81 d81Var = this.f31697a;
        Switch r02 = d81Var.d;
        r02.c(!r02.h, true);
        this.f31698b.encrypted_requests_disabled = !d81Var.d.h;
        e81.n(this.f31699c);
    }
}
