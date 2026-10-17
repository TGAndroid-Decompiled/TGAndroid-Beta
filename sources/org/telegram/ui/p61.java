package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39978a;
    public final w61 f39979b;

    public p61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39979b = w61Var;
        this.f39978a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        w61.n(this.f39979b, this.f39978a.country);
        return true;
    }
}
