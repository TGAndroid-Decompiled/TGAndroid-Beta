package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f31764a;
    public final f81 f31765b;

    public a81(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31765b = f81Var;
        this.f31764a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        f81.m(this.f31765b, this.f31764a.country);
        return true;
    }
}
