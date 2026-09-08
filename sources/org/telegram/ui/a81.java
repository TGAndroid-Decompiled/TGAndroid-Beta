package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f34379a;
    public final g81 f34380b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34380b = g81Var;
        this.f34379a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f34380b, this.f34379a.ip);
    }
}
