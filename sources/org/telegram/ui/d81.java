package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class d81 implements View.OnClickListener {
    public final g81 f36946a;
    public final TLRPC.TL_authorization f36947b;
    public final h81 f36948c;

    public d81(h81 h81Var, g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36948c = h81Var;
        this.f36946a = g81Var;
        this.f36947b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81 g81Var = this.f36946a;
        Switch r02 = g81Var.d;
        r02.c(!r02.h, true);
        this.f36947b.encrypted_requests_disabled = !g81Var.d.h;
        h81.p(this.f36948c);
    }
}
