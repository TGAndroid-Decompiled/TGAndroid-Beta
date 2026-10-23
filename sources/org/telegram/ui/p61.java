package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40084a;
    public final u61 f40085b;

    public p61(u61 u61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40085b = u61Var;
        this.f40084a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u61.n(this.f40085b, this.f40084a.country);
        return true;
    }
}
