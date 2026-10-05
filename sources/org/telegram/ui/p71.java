package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f39382a;
    public final x71 f39383b;

    public p71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39383b = x71Var;
        this.f39382a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x71.m(this.f39383b, this.f39382a.country);
    }
}
