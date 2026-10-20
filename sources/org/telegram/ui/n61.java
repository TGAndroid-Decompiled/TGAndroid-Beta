package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39437a;
    public final u61 f39438b;

    public n61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39438b = u61Var;
        this.f39437a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f39438b, this.f39437a.country);
        return true;
    }
}
