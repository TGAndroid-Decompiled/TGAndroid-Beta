package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f38295a;
    public final p71 f38296b;

    public k71(p71 p71Var, TLRPC.TL_authorization tL_authorization) {
        this.f38296b = p71Var;
        this.f38295a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        p71.m(this.f38296b, this.f38295a.country);
        return true;
    }
}
