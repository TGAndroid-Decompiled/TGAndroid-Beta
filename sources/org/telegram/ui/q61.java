package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40642a;
    public final y61 f40643b;

    public q61(y61 y61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40643b = y61Var;
        this.f40642a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        y61.m(this.f40643b, this.f40642a.country);
    }
}
