package org.telegram.ui;

import android.content.Context;
public final class j40 extends org.telegram.ui.Components.r00 {
    public final r40 f46492r;

    public j40(r40 r40Var, Context context, int i3) {
        super(context, i3);
        this.f46492r = r40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.y10 y10Var) {
        super.a(y10Var);
        r40.e0(this.f46492r);
    }

    @Override
    public final void b() {
        super.b();
        r40.e0(this.f46492r);
    }

    @Override
    public final void c(org.telegram.ui.Components.y10 y10Var) {
        r40 r40Var = this.f46492r;
        if (y10Var == r40Var.Y) {
            r40Var.Y = null;
        }
        if (y10Var == r40Var.Z) {
            r40Var.Z = null;
        }
        super.c(y10Var);
        r40.e0(r40Var);
    }
}
