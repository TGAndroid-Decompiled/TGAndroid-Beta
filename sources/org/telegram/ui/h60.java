package org.telegram.ui;

import android.content.Context;
public final class h60 extends org.telegram.ui.Components.o20 {
    public final p60 f37759r;

    public h60(p60 p60Var, Context context, int i10) {
        super(context, i10);
        this.f37759r = p60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        p60.Z(this.f37759r);
    }

    @Override
    public final void b() {
        super.b();
        p60.Z(this.f37759r);
    }

    @Override
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        p60 p60Var = this.f37759r;
        if (v30Var == p60Var.X) {
            p60Var.X = null;
        }
        if (v30Var == p60Var.Y) {
            p60Var.Y = null;
        }
        super.c(v30Var);
        p60.Z(p60Var);
    }
}
