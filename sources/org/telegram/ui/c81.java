package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f31571a;
    public final j81 f31572b;

    public c81(j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31572b = j81Var;
        this.f31571a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        j81.m(this.f31572b, this.f31571a.country);
        return true;
    }
}
