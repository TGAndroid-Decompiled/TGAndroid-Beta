package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnClickListener {
    public final TLRPC.TL_authorization f34380a;
    public final g81 f34381b;

    public a81(g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.f34381b = g81Var;
        this.f34380a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        g81.m(this.f34381b, this.f34380a.ip);
    }
}
