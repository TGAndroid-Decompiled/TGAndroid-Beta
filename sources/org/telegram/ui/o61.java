package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39781a;
    public final u61 f39782b;

    public o61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f39782b = u61Var;
        this.f39781a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u61.n(this.f39782b, this.f39781a.ip);
    }
}
