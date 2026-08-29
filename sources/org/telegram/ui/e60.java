package org.telegram.ui;

import android.content.Context;
public final class e60 extends org.telegram.ui.Components.b20 {
    public final m60 f37705r;

    public e60(m60 m60Var, Context context, int i10) {
        super(context, i10);
        this.f37705r = m60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.j30 j30Var) {
        super.a(j30Var);
        m60.Z(this.f37705r);
    }

    @Override
    public final void b() {
        super.b();
        m60.Z(this.f37705r);
    }

    @Override
    public final void c(org.telegram.ui.Components.j30 j30Var) {
        m60 m60Var = this.f37705r;
        if (j30Var == m60Var.T) {
            m60Var.T = null;
        }
        if (j30Var == m60Var.U) {
            m60Var.U = null;
        }
        super.c(j30Var);
        m60.Z(m60Var);
    }
}
