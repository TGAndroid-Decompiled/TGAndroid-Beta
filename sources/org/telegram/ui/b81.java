package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f32306a;
    public final g81 f32307b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32307b = g81Var;
        this.f32306a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f32307b, this.f32306a.country);
        return true;
    }
}
