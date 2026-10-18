package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39958a;
    public final w61 f39959b;

    public p61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39959b = w61Var;
        this.f39958a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w61.n(this.f39959b, this.f39958a.country);
        return true;
    }
}
