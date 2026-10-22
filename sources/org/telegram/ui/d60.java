package org.telegram.ui;

import android.content.Context;
public final class d60 extends org.telegram.ui.Components.o20 {
    public final l60 f36279r;

    public d60(l60 l60Var, Context context, int i10) {
        super(context, i10);
        this.f36279r = l60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.v30 v30Var) {
        super.a(v30Var);
        l60.Z(this.f36279r);
    }

    @Override
    public final void b() {
        super.b();
        l60.Z(this.f36279r);
    }

    @Override
    public final void c(org.telegram.ui.Components.v30 v30Var) {
        l60 l60Var = this.f36279r;
        if (v30Var == l60Var.X) {
            l60Var.X = null;
        }
        if (v30Var == l60Var.Y) {
            l60Var.Y = null;
        }
        super.c(v30Var);
        l60.Z(l60Var);
    }
}
