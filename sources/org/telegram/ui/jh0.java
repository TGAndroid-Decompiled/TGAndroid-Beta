package org.telegram.ui;

import android.content.Context;
public final class jh0 implements org.telegram.ui.Components.o90 {
    public final org.telegram.ui.Components.p90 f38567a;
    public final kh0 f38568b;

    public jh0(kh0 kh0Var, org.telegram.ui.Components.p90 p90Var) {
        this.f38568b = kh0Var;
        this.f38567a = p90Var;
    }

    @Override
    public final void c() {
        lh0.W(this.f38568b.d);
    }

    @Override
    public final void j() {
        kh0 kh0Var = this.f38568b;
        lh0 lh0Var = kh0Var.d;
        Context context = this.f38567a.getContext();
        lh0 lh0Var2 = kh0Var.d;
        lh0Var.f39286l0 = new org.telegram.ui.Components.k70(context, lh0Var2.e, lh0Var2.d, lh0Var2.f39285k0, lh0Var2, lh0Var2.f39287n, true, lh0Var2.h);
        kh0Var.d.f39286l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
