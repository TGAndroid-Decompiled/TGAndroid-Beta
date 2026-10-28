package org.telegram.ui.Components;

import android.content.Context;
public final class n81 extends i2.k {
    public final t81 d;

    public n81(Context context, t81 t81Var) {
        super(context);
        this.d = t81Var;
    }

    @Override
    public final k2.u0 a(Context context) {
        di.p4 p4Var = new di.p4(context, 1);
        p4Var.d = new a8.h0(new c2.o[]{new k2.b1(new s81(this.d))});
        return p4Var.a();
    }
}
