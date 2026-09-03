package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n71 implements View.OnClickListener {
    public final TLRPC.TL_authorization f36402a;
    public final v71 f36403b;

    public n71(v71 v71Var, TLRPC.TL_authorization tL_authorization) {
        this.f36403b = v71Var;
        this.f36402a = tL_authorization;
    }

    @Override
    public final void onClick(View view) {
        v71.m(this.f36403b, this.f36402a.country);
    }
}
