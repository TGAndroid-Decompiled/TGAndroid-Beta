package org.telegram.ui;

import android.content.Context;
public final class hh0 implements org.telegram.ui.Components.q90 {
    public final org.telegram.ui.Components.r90 f40008a;
    public final ih0 f40009b;

    public hh0(ih0 ih0Var, org.telegram.ui.Components.r90 r90Var) {
        this.f40009b = ih0Var;
        this.f40008a = r90Var;
    }

    @Override
    public final void d() {
        jh0.X(this.f40009b.d);
    }

    @Override
    public final void e() {
        ih0 ih0Var = this.f40009b;
        jh0 jh0Var = ih0Var.d;
        Context context = this.f40008a.getContext();
        jh0 jh0Var2 = ih0Var.d;
        jh0Var.f40657l0 = new org.telegram.ui.Components.n70(context, jh0Var2.e, jh0Var2.d, jh0Var2.f40656k0, jh0Var2, jh0Var2.f40658n, true, jh0Var2.h);
        ih0Var.d.f40657l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
