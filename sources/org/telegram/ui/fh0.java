package org.telegram.ui;

import android.content.Context;
public final class fh0 implements org.telegram.ui.Components.d80 {
    public final org.telegram.ui.Components.e80 f38292a;
    public final gh0 f38293b;

    public fh0(gh0 gh0Var, org.telegram.ui.Components.e80 e80Var) {
        this.f38293b = gh0Var;
        this.f38292a = e80Var;
    }

    @Override
    public final void c() {
        hh0.V(this.f38293b.d);
    }

    @Override
    public final void j() {
        gh0 gh0Var = this.f38293b;
        hh0 hh0Var = gh0Var.d;
        Context context = this.f38292a.getContext();
        hh0 hh0Var2 = gh0Var.d;
        hh0Var.f38803h0 = new org.telegram.ui.Components.a60(context, hh0Var2.f38798e, hh0Var2.d, hh0Var2.f38802g0, hh0Var2, hh0Var2.f38808n, true, hh0Var2.h);
        gh0Var.d.f38803h0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void k() {
    }
}
