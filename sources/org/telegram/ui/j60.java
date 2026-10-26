package org.telegram.ui;

import android.content.Context;
public final class j60 extends org.telegram.ui.Components.q20 {
    public final r60 f40470r;

    public j60(r60 r60Var, Context context, int i10) {
        super(context, i10);
        this.f40470r = r60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.x30 x30Var) {
        super.a(x30Var);
        r60.a0(this.f40470r);
    }

    @Override
    public final void b() {
        super.b();
        r60.a0(this.f40470r);
    }

    @Override
    public final void c(org.telegram.ui.Components.x30 x30Var) {
        r60 r60Var = this.f40470r;
        if (x30Var == r60Var.X) {
            r60Var.X = null;
        }
        if (x30Var == r60Var.Y) {
            r60Var.Y = null;
        }
        super.c(x30Var);
        r60.a0(r60Var);
    }
}
