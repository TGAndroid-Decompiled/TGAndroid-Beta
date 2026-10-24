package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p61 implements View.OnClickListener {
    public final TLRPC.TL_authorization f40378a;
    public final x61 f40379b;

    public p61(x61 x61Var, TLRPC.TL_authorization tL_authorization) {
        this.f40379b = x61Var;
        this.f40378a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x61.m(this.f40379b, this.f40378a.country);
    }
}
