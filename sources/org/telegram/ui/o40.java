package org.telegram.ui;

import android.content.Context;
public final class o40 extends org.telegram.ui.Components.v00 {
    public final w40 f48224r;

    public o40(w40 w40Var, Context context, int i7) {
        super(context, i7);
        this.f48224r = w40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.c20 c20Var) {
        super.a(c20Var);
        w40.e0(this.f48224r);
    }

    @Override
    public final void b() {
        super.b();
        w40.e0(this.f48224r);
    }

    @Override
    public final void c(org.telegram.ui.Components.c20 c20Var) {
        w40 w40Var = this.f48224r;
        if (c20Var == w40Var.X) {
            w40Var.X = null;
        }
        if (c20Var == w40Var.Y) {
            w40Var.Y = null;
        }
        super.c(c20Var);
        w40.e0(w40Var);
    }
}
