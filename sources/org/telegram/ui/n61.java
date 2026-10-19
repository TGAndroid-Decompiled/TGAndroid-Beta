package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39435a;
    public final u61 f39436b;

    public n61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39436b = u61Var;
        this.f39435a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f39436b, this.f39435a.country);
        return true;
    }
}
