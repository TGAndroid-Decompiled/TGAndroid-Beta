package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q61 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f40724a;
    public final x61 f40725b;

    public q61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40725b = x61Var;
        this.f40724a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        x61.m(this.f40725b, this.f40724a.country);
        return true;
    }
}
