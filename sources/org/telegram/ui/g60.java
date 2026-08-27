package org.telegram.ui;

import android.content.Context;

public final class g60 extends org.telegram.ui.Components.t10 {

    public final o60 f38326r;

    public g60(o60 o60Var, Context context, int i10) {
        super(context, i10);
        this.f38326r = o60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.a30 a30Var) {
        super.a(a30Var);
        o60.Z(this.f38326r);
    }

    @Override
    public final void b() {
        super.b();
        o60.Z(this.f38326r);
    }

    @Override
    public final void c(org.telegram.ui.Components.a30 a30Var) {
        o60 o60Var = this.f38326r;
        if (a30Var == o60Var.T) {
            o60Var.T = null;
        }
        if (a30Var == o60Var.U) {
            o60Var.U = null;
        }
        super.c(a30Var);
        o60.Z(o60Var);
    }
}
