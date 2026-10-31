package org.telegram.ui;

import android.content.Context;
public final class n50 extends org.telegram.ui.Components.l10 {
    public final v50 f39829r;

    public n50(v50 v50Var, Context context, int i10) {
        super(context, i10);
        this.f39829r = v50Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.s20 s20Var) {
        super.a(s20Var);
        v50.d0(this.f39829r);
    }

    @Override
    public final void b() {
        super.b();
        v50.d0(this.f39829r);
    }

    @Override
    public final void c(org.telegram.ui.Components.s20 s20Var) {
        v50 v50Var = this.f39829r;
        if (s20Var == v50Var.X) {
            v50Var.X = null;
        }
        if (s20Var == v50Var.Y) {
            v50Var.Y = null;
        }
        super.c(s20Var);
        v50.d0(v50Var);
    }
}
