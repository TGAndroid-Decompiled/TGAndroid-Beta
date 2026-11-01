package org.telegram.ui;

import android.content.Context;
public final class m50 extends org.telegram.ui.Components.l10 {
    public final u50 f39433r;

    public m50(u50 u50Var, Context context, int i10) {
        super(context, i10);
        this.f39433r = u50Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.s20 s20Var) {
        super.a(s20Var);
        u50.e0(this.f39433r);
    }

    @Override
    public final void b() {
        super.b();
        u50.e0(this.f39433r);
    }

    @Override
    public final void c(org.telegram.ui.Components.s20 s20Var) {
        u50 u50Var = this.f39433r;
        if (s20Var == u50Var.X) {
            u50Var.X = null;
        }
        if (s20Var == u50Var.Y) {
            u50Var.Y = null;
        }
        super.c(s20Var);
        u50.e0(u50Var);
    }
}
