package org.telegram.ui;

import android.content.Context;
public final class gg0 implements org.telegram.ui.Components.i80 {
    public final org.telegram.ui.Components.j80 f37507a;
    public final hg0 f37508b;

    public gg0(hg0 hg0Var, org.telegram.ui.Components.j80 j80Var) {
        this.f37508b = hg0Var;
        this.f37507a = j80Var;
    }

    @Override
    public final void d() {
        ig0.b0(this.f37508b.d);
    }

    @Override
    public final void g() {
        hg0 hg0Var = this.f37508b;
        ig0 ig0Var = hg0Var.d;
        Context context = this.f37507a.getContext();
        ig0 ig0Var2 = hg0Var.d;
        ig0Var.f38041l0 = new org.telegram.ui.Components.c60(context, ig0Var2.e, ig0Var2.d, ig0Var2.f38040k0, ig0Var2, ig0Var2.f38042n, true, ig0Var2.h);
        hg0Var.d.f38041l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void n() {
    }
}
