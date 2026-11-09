package org.telegram.ui;

import android.content.Context;
public final class cf0 implements org.telegram.ui.Components.q70 {
    public final org.telegram.ui.Components.r70 f44299a;
    public final df0 f44300b;

    public cf0(df0 df0Var, org.telegram.ui.Components.r70 r70Var) {
        this.f44300b = df0Var;
        this.f44299a = r70Var;
    }

    @Override
    public final void e() {
        ef0.b0(this.f44300b.d);
    }

    @Override
    public final void f() {
        df0 df0Var = this.f44300b;
        ef0 ef0Var = df0Var.d;
        Context context = this.f44299a.getContext();
        ef0 ef0Var2 = df0Var.d;
        ef0Var.f45421l0 = new org.telegram.ui.Components.n50(context, ef0Var2.f45412e, ef0Var2.d, ef0Var2.f45420k0, ef0Var2, ef0Var2.f45422n, true, ef0Var2.h);
        df0Var.d.f45421l0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
