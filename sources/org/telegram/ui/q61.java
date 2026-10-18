package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40331a;
    public final w61 f40332b;

    public q61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40332b = w61Var;
        this.f40331a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61.n(this.f40332b, this.f40331a.ip);
    }
}
