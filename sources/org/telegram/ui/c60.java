package org.telegram.ui;

import android.content.Context;
public final class c60 extends org.telegram.ui.Components.q10 {
    public final k60 f37075r;

    public c60(k60 k60Var, Context context, int i9) {
        super(context, i9);
        this.f37075r = k60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.w20 w20Var) {
        super.a(w20Var);
        k60.Y(this.f37075r);
    }

    @Override
    public final void b() {
        super.b();
        k60.Y(this.f37075r);
    }

    @Override
    public final void c(org.telegram.ui.Components.w20 w20Var) {
        k60 k60Var = this.f37075r;
        if (w20Var == k60Var.T) {
            k60Var.T = null;
        }
        if (w20Var == k60Var.U) {
            k60Var.U = null;
        }
        super.c(w20Var);
        k60.Y(k60Var);
    }
}
