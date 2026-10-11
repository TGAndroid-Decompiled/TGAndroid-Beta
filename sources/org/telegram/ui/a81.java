package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f35962a;
    public final g81 f35963b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f35963b = g81Var;
        this.f35962a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.o(this.f35963b, this.f35962a.ip);
    }
}
