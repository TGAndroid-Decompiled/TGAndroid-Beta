package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e81 implements View.OnLongClickListener {
    public final TLRPC.TL_authorization f32121a;
    public final j81 f32122b;

    public e81(j81 j81Var, TLRPC.TL_authorization tL_authorization) {
        this.f32122b = j81Var;
        this.f32121a = tL_authorization;
    }

    @Override
    public final boolean onLongClick(View view) {
        j81.m(this.f32122b, this.f32121a.country);
        return true;
    }
}
