package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f34686a;
    public final g81 f34687b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34687b = g81Var;
        this.f34686a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f34687b, this.f34686a.country);
        return true;
    }
}
