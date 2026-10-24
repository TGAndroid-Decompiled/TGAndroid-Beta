package org.telegram.ui;

import android.content.Context;
public final class h60 extends org.telegram.ui.Components.m20 {
    public final p60 f37764r;

    public h60(p60 p60Var, Context context, int i10) {
        super(context, i10);
        this.f37764r = p60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.t30 t30Var) {
        super.a(t30Var);
        p60.Z(this.f37764r);
    }

    @Override
    public final void b() {
        super.b();
        p60.Z(this.f37764r);
    }

    @Override
    public final void c(org.telegram.ui.Components.t30 t30Var) {
        p60 p60Var = this.f37764r;
        if (t30Var == p60Var.X) {
            p60Var.X = null;
        }
        if (t30Var == p60Var.Y) {
            p60Var.Y = null;
        }
        super.c(t30Var);
        p60.Z(p60Var);
    }
}
