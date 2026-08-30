package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f35037a;
    public final o71 f35038b;

    public i71(o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.f35038b = o71Var;
        this.f35037a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        o71.m(this.f35038b, this.f35037a.ip);
    }
}
