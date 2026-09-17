package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f34687a;
    public final g81 f34688b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34688b = g81Var;
        this.f34687a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f34688b, this.f34687a.country);
        return true;
    }
}
