package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39440a;
    public final u61 f39441b;

    public n61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39441b = u61Var;
        this.f39440a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f39441b, this.f39440a.country);
        return true;
    }
}
