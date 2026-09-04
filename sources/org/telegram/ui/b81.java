package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f34659a;
    public final g81 f34660b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34660b = g81Var;
        this.f34659a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f34660b, this.f34659a.country);
        return true;
    }
}
