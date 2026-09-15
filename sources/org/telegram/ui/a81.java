package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
public final class a81 implements View.OnClickListener {
    public final c81 f31723a;
    public final TLRPC.TL_authorization f31724b;
    public final d81 f31725c;

    public a81(d81 d81Var, c81 c81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31725c = d81Var;
        this.f31723a = c81Var;
        this.f31724b = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        c81 c81Var = this.f31723a;
        Switch r02 = c81Var.d;
        r02.c(!r02.h, true);
        this.f31724b.call_requests_disabled = !c81Var.d.h;
        d81.n(this.f31725c);
    }
}
