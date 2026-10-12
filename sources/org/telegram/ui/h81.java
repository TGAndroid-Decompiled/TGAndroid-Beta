package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class h81 implements View.OnClickListener {
    public final j81 f38293a;
    public final TLRPC.TL_authorization f38294b;
    public final k81 f38295c;

    public h81(k81 k81Var, j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f38295c = k81Var;
        this.f38293a = j81Var;
        this.f38294b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        j81 j81Var = this.f38293a;
        Switch r02 = j81Var.d;
        r02.c(!r02.h, true);
        this.f38294b.call_requests_disabled = !j81Var.d.h;
        k81.p(this.f38295c);
    }
}
