package org.telegram.ui;

import android.content.Context;
public final class b70 extends org.telegram.ui.Components.s20 {
    public final j70 f34217r;

    public b70(j70 j70Var, Context context, int i10) {
        super(context, i10);
        this.f34217r = j70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.z30 z30Var) {
        super.a(z30Var);
        j70.Z(this.f34217r);
    }

    @Override
    public final void b() {
        super.b();
        j70.Z(this.f34217r);
    }

    @Override
    public final void c(org.telegram.ui.Components.z30 z30Var) {
        j70 j70Var = this.f34217r;
        if (z30Var == j70Var.X) {
            j70Var.X = null;
        }
        if (z30Var == j70Var.Y) {
            j70Var.Y = null;
        }
        super.c(z30Var);
        j70.Z(j70Var);
    }
}
