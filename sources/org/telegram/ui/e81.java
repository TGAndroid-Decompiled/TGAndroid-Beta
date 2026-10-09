package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class e81 implements View.OnClickListener {
    public final g81 f37193a;
    public final TLRPC.TL_authorization f37194b;
    public final h81 f37195c;

    public e81(h81 h81Var, g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f37195c = h81Var;
        this.f37193a = g81Var;
        this.f37194b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81 g81Var = this.f37193a;
        Switch r02 = g81Var.d;
        r02.c(!r02.h, true);
        this.f37194b.call_requests_disabled = !g81Var.d.h;
        h81.p(this.f37195c);
    }
}
