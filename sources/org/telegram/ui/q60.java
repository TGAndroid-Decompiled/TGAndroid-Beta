package org.telegram.ui;

import android.content.Context;
public final class q60 extends org.telegram.ui.Components.g20 {
    public final y60 f37593r;

    public q60(y60 y60Var, Context context, int i10) {
        super(context, i10);
        this.f37593r = y60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        y60.Z(this.f37593r);
    }

    @Override
    public final void b() {
        super.b();
        y60.Z(this.f37593r);
    }

    @Override
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        y60 y60Var = this.f37593r;
        if (n30Var == y60Var.U) {
            y60Var.U = null;
        }
        if (n30Var == y60Var.V) {
            y60Var.V = null;
        }
        super.c(n30Var);
        y60.Z(y60Var);
    }
}
