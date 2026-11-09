package org.telegram.ui;

import android.content.Context;
public final class q40 extends org.telegram.ui.Components.w00 {
    public final y40 f48893r;

    public q40(y40 y40Var, Context context, int i7) {
        super(context, i7);
        this.f48893r = y40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.d20 d20Var) {
        super.a(d20Var);
        y40.e0(this.f48893r);
    }

    @Override
    public final void b() {
        super.b();
        y40.e0(this.f48893r);
    }

    @Override
    public final void c(org.telegram.ui.Components.d20 d20Var) {
        y40 y40Var = this.f48893r;
        if (d20Var == y40Var.X) {
            y40Var.X = null;
        }
        if (d20Var == y40Var.Y) {
            y40Var.Y = null;
        }
        super.c(d20Var);
        y40.e0(y40Var);
    }
}
