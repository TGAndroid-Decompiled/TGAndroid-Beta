package org.telegram.ui;

import android.content.Context;
public final class q40 extends org.telegram.ui.Components.h10 {
    public final y40 f51314r;

    public q40(y40 y40Var, Context context, int i7) {
        super(context, i7);
        this.f51314r = y40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.n20 n20Var) {
        super.a(n20Var);
        y40.e0(this.f51314r);
    }

    @Override
    public final void b() {
        super.b();
        y40.e0(this.f51314r);
    }

    @Override
    public final void c(org.telegram.ui.Components.n20 n20Var) {
        y40 y40Var = this.f51314r;
        if (n20Var == y40Var.Y) {
            y40Var.Y = null;
        }
        if (n20Var == y40Var.Z) {
            y40Var.Z = null;
        }
        super.c(n20Var);
        y40.e0(y40Var);
    }
}
