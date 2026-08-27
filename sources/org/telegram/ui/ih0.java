package org.telegram.ui;

import android.content.Context;

public final class ih0 implements org.telegram.ui.Components.h80 {

    public final org.telegram.ui.Components.i80 f39113a;

    public final jh0 f39114b;

    public ih0(jh0 jh0Var, org.telegram.ui.Components.i80 i80Var) {
        this.f39114b = jh0Var;
        this.f39113a = i80Var;
    }

    @Override
    public final void c() {
        kh0.W(this.f39114b.d);
    }

    @Override
    public final void g() {
        jh0 jh0Var = this.f39114b;
        kh0 kh0Var = jh0Var.d;
        Context context = this.f39113a.getContext();
        kh0 kh0Var2 = jh0Var.d;
        kh0Var.f39748h0 = new org.telegram.ui.Components.f60(context, kh0Var2.f39743e, kh0Var2.d, kh0Var2.f39747g0, kh0Var2, kh0Var2.f39753n, true, kh0Var2.h);
        jh0Var.d.f39748h0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void k() {
    }
}
