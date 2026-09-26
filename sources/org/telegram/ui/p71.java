package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36428a;
    public final x71 f36429b;

    public p71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36429b = x71Var;
        this.f36428a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        x71.m(this.f36429b, this.f36428a.country);
    }
}
