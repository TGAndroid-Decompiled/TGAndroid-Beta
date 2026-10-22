package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39789a;
    public final u61 f39790b;

    public o61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39790b = u61Var;
        this.f39789a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u61.n(this.f39790b, this.f39789a.ip);
    }
}
