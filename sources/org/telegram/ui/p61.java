package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40083a;
    public final u61 f40084b;

    public p61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40084b = u61Var;
        this.f40083a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f40084b, this.f40083a.country);
        return true;
    }
}
