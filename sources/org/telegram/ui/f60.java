package org.telegram.ui;

import android.content.Context;
public final class f60 extends org.telegram.ui.Components.o20 {
    public final n60 f36812r;

    public f60(n60 n60Var, Context context, int i10) {
        super(context, i10);
        this.f36812r = n60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        n60.Z(this.f36812r);
    }

    @Override
    public final void b() {
        super.b();
        n60.Z(this.f36812r);
    }

    @Override
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        n60 n60Var = this.f36812r;
        if (v30Var == n60Var.X) {
            n60Var.X = null;
        }
        if (v30Var == n60Var.Y) {
            n60Var.Y = null;
        }
        super.c(v30Var);
        n60.Z(n60Var);
    }
}
