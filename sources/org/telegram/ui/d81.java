package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d81 implements View.OnClickListener {
    public final g81 f36902a;
    public final TLRPC.TL_authorization f36903b;
    public final h81 f36904c;

    public d81(h81 h81Var, g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36904c = h81Var;
        this.f36902a = g81Var;
        this.f36903b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81 g81Var = this.f36902a;
        Switch r02 = g81Var.d;
        r02.c(!r02.h, true);
        this.f36903b.encrypted_requests_disabled = !g81Var.d.h;
        h81.p(this.f36904c);
    }
}
