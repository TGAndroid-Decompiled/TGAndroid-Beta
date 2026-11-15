package org.telegram.ui;

import android.content.Context;
public final class o40 extends org.telegram.ui.Components.z00 {
    public final w40 f49804r;

    public o40(w40 w40Var, Context context, int i7) {
        super(context, i7);
        this.f49804r = w40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.f20 f20Var) {
        super.a(f20Var);
        w40.e0(this.f49804r);
    }

    @Override
    public final void b() {
        super.b();
        w40.e0(this.f49804r);
    }

    @Override
    public final void c(org.telegram.ui.Components.f20 f20Var) {
        w40 w40Var = this.f49804r;
        if (f20Var == w40Var.Y) {
            w40Var.Y = null;
        }
        if (f20Var == w40Var.Z) {
            w40Var.Z = null;
        }
        super.c(f20Var);
        w40.e0(w40Var);
    }
}
