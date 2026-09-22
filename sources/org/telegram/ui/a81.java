package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f32029a;
    public final g81 f32030b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32030b = g81Var;
        this.f32029a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f32030b, this.f32029a.ip);
    }
}
