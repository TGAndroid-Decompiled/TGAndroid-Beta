package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40289a;
    public final w61 f40290b;

    public q61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40290b = w61Var;
        this.f40289a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61.n(this.f40290b, this.f40289a.ip);
    }
}
