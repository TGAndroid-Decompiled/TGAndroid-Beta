package org.telegram.ui;

import android.content.Context;
public final class nh0 implements org.telegram.ui.Components.w80 {
    public final org.telegram.ui.Components.x80 f36657a;
    public final oh0 f36658b;

    public nh0(oh0 oh0Var, org.telegram.ui.Components.x80 x80Var) {
        this.f36658b = oh0Var;
        this.f36657a = x80Var;
    }

    @Override
    public final void c() {
        ph0.W(this.f36658b.d);
    }

    @Override
    public final void e() {
        oh0 oh0Var = this.f36658b;
        ph0 ph0Var = oh0Var.d;
        Context context = this.f36657a.getContext();
        ph0 ph0Var2 = oh0Var.d;
        ph0Var.f37329i0 = new org.telegram.ui.Components.s60(context, ph0Var2.e, ph0Var2.d, ph0Var2.f37328h0, ph0Var2, ph0Var2.f37333n, true, ph0Var2.h);
        oh0Var.d.f37329i0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
