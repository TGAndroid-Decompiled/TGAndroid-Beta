package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f39913a;
    public final u71 f39914b;

    public p71(u71 u71Var, TLRPC.TL_authorization tL_authorization) {
        this.f39914b = u71Var;
        this.f39913a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        u71.m(this.f39914b, this.f39913a.country);
        return true;
    }
}
