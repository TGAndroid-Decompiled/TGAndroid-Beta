package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f31760a;
    public final f81 f31761b;

    public a81(f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.f31761b = f81Var;
        this.f31760a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        f81.m(this.f31761b, this.f31760a.country);
        return true;
    }
}
