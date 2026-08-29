package org.telegram.ui;

import android.content.Context;
public final class fh0 implements org.telegram.ui.Components.q80 {
    public final org.telegram.ui.Components.r80 f38184a;
    public final gh0 f38185b;

    public fh0(gh0 gh0Var, org.telegram.ui.Components.r80 r80Var) {
        this.f38185b = gh0Var;
        this.f38184a = r80Var;
    }

    @Override
    public final void b() {
        hh0.W(this.f38185b.d);
    }

    @Override
    public final void j() {
        gh0 gh0Var = this.f38185b;
        hh0 hh0Var = gh0Var.d;
        Context context = this.f38184a.getContext();
        hh0 hh0Var2 = gh0Var.d;
        hh0Var.f38924h0 = new org.telegram.ui.Components.n60(context, hh0Var2.f38919e, hh0Var2.d, hh0Var2.f38923g0, hh0Var2, hh0Var2.f38929n, true, hh0Var2.h);
        gh0Var.d.f38924h0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
