package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39780a;
    public final u61 f39781b;

    public o61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39781b = u61Var;
        this.f39780a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u61.n(this.f39781b, this.f39780a.ip);
    }
}
