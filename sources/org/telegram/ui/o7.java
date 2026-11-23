package org.telegram.ui;

import android.content.Context;
public final class o7 extends org.telegram.ui.Cells.h7 {
    public final j7 m0;
    public final p7 f50499n0;

    public o7(p7 p7Var, Context context, j7 j7Var) {
        super(0, context, null);
        this.f50499n0 = p7Var;
        this.m0 = j7Var;
    }

    @Override
    public final void a() {
        s7 s7Var = this.f50499n0.f50771n;
        j7 j7Var = this.m0;
        s7.b(s7Var, (ei.b) j7Var.getTag(), j7Var);
    }
}
