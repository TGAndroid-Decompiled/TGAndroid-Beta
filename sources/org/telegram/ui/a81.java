package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f35928a;
    public final g81 f35929b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35929b = g81Var;
        this.f35928a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.o(this.f35929b, this.f35928a.ip);
    }
}
