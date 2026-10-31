package org.telegram.ui;

import android.content.Context;
public final class ig0 implements org.telegram.ui.Components.i80 {
    public final org.telegram.ui.Components.j80 f38259a;
    public final jg0 f38260b;

    public ig0(jg0 jg0Var, org.telegram.ui.Components.j80 j80Var) {
        this.f38260b = jg0Var;
        this.f38259a = j80Var;
    }

    @Override
    public final void d() {
        kg0.a0(this.f38260b.d);
    }

    @Override
    public final void g() {
        jg0 jg0Var = this.f38260b;
        kg0 kg0Var = jg0Var.d;
        Context context = this.f38259a.getContext();
        kg0 kg0Var2 = jg0Var.d;
        kg0Var.f38809l0 = new org.telegram.ui.Components.c60(context, kg0Var2.e, kg0Var2.d, kg0Var2.f38808k0, kg0Var2, kg0Var2.f38810n, true, kg0Var2.h);
        jg0Var.d.f38809l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void n() {
    }
}
