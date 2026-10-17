package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39673a;
    public final w61 f39674b;

    public o61(w61 w61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39674b = w61Var;
        this.f39673a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        w61.n(this.f39674b, this.f39673a.country);
    }
}
