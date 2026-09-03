package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39220a;
    public final u71 f39221b;

    public n71(u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39221b = u71Var;
        this.f39220a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u71.m(this.f39221b, this.f39220a.country);
        return true;
    }
}
