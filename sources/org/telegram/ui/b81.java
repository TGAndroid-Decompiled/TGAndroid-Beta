package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36299a;
    public final g81 f36300b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36300b = g81Var;
        this.f36299a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.o(this.f36300b, this.f36299a.country);
        return true;
    }
}
