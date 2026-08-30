package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h71 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f34777a;
    public final o71 f34778b;

    public h71(o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.f34778b = o71Var;
        this.f34777a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        o71.m(this.f34778b, this.f34777a.country);
        return true;
    }
}
