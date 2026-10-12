package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class g81 implements View.OnClickListener {
    public final j81 f37979a;
    public final TLRPC.TL_authorization f37980b;
    public final k81 f37981c;

    public g81(k81 k81Var, j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37981c = k81Var;
        this.f37979a = j81Var;
        this.f37980b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        j81 j81Var = this.f37979a;
        Switch r02 = j81Var.d;
        r02.c(!r02.h, true);
        this.f37980b.encrypted_requests_disabled = !j81Var.d.h;
        k81.p(this.f37981c);
    }
}
