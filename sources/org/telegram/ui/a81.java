package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f34352a;
    public final g81 f34353b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34353b = g81Var;
        this.f34352a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f34353b, this.f34352a.ip);
    }
}
