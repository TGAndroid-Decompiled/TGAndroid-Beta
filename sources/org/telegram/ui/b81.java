package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f32288a;
    public final g81 f32289b;

    public b81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32289b = g81Var;
        this.f32288a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        g81.m(this.f32289b, this.f32288a.country);
        return true;
    }
}
