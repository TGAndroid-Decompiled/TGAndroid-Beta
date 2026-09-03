package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39564a;
    public final u71 f39565b;

    public o71(u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39565b = u71Var;
        this.f39564a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        u71.m(this.f39565b, this.f39564a.ip);
    }
}
