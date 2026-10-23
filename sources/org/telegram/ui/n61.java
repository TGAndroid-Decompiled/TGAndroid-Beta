package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39441a;
    public final u61 f39442b;

    public n61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39442b = u61Var;
        this.f39441a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f39442b, this.f39441a.country);
        return true;
    }
}
