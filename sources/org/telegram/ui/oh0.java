package org.telegram.ui;

import android.content.Context;
public final class oh0 implements org.telegram.ui.Components.x80 {
    public final org.telegram.ui.Components.y80 f39744a;
    public final ph0 f39745b;

    public oh0(ph0 ph0Var, org.telegram.ui.Components.y80 y80Var) {
        this.f39745b = ph0Var;
        this.f39744a = y80Var;
    }

    @Override
    public final void c() {
        qh0.W(this.f39745b.d);
    }

    @Override
    public final void e() {
        ph0 ph0Var = this.f39745b;
        qh0 qh0Var = ph0Var.d;
        Context context = this.f39744a.getContext();
        qh0 qh0Var2 = ph0Var.d;
        qh0Var.f40494i0 = new org.telegram.ui.Components.u60(context, qh0Var2.f40488e, qh0Var2.d, qh0Var2.f40493h0, qh0Var2, qh0Var2.f40498n, true, qh0Var2.h);
        ph0Var.d.f40494i0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
