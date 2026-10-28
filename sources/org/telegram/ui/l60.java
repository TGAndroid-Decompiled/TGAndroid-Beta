package org.telegram.ui;

import android.content.Context;
public final class l60 extends org.telegram.ui.Components.q20 {
    public final t60 f40981r;

    public l60(t60 t60Var, Context context, int i10) {
        super(context, i10);
        this.f40981r = t60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.x30 x30Var) {
        super.a(x30Var);
        t60.a0(this.f40981r);
    }

    @Override
    public final void b() {
        super.b();
        t60.a0(this.f40981r);
    }

    @Override
    public final void c(org.telegram.ui.Components.x30 x30Var) {
        t60 t60Var = this.f40981r;
        if (x30Var == t60Var.X) {
            t60Var.X = null;
        }
        if (x30Var == t60Var.Y) {
            t60Var.Y = null;
        }
        super.c(x30Var);
        t60.a0(t60Var);
    }
}
