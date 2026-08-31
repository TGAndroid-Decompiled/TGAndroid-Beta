package org.telegram.ui;

import android.content.Context;
public final class oh0 implements org.telegram.ui.Components.x80 {
    public final org.telegram.ui.Components.y80 f39783a;
    public final ph0 f39784b;

    public oh0(ph0 ph0Var, org.telegram.ui.Components.y80 y80Var) {
        this.f39784b = ph0Var;
        this.f39783a = y80Var;
    }

    @Override
    public final void c() {
        qh0.W(this.f39784b.d);
    }

    @Override
    public final void e() {
        ph0 ph0Var = this.f39784b;
        qh0 qh0Var = ph0Var.d;
        Context context = this.f39783a.getContext();
        qh0 qh0Var2 = ph0Var.d;
        qh0Var.f40513i0 = new org.telegram.ui.Components.u60(context, qh0Var2.f40507e, qh0Var2.d, qh0Var2.f40512h0, qh0Var2, qh0Var2.f40517n, true, qh0Var2.h);
        ph0Var.d.f40513i0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
