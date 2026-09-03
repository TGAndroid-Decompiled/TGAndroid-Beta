package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36990a;
    public final v71 f36991b;

    public p71(v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36991b = v71Var;
        this.f36990a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v71.m(this.f36991b, this.f36990a.ip);
    }
}
