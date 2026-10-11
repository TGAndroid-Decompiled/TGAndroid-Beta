package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f36333a;
    public final g81 f36334b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f36334b = g81Var;
        this.f36333a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.o(this.f36334b, this.f36333a.country);
        return true;
    }
}
