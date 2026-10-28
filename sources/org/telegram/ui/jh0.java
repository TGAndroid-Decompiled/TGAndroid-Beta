package org.telegram.ui;

import android.content.Context;
public final class jh0 implements org.telegram.ui.Components.r90 {
    public final org.telegram.ui.Components.s90 f40541a;
    public final kh0 f40542b;

    public jh0(kh0 kh0Var, org.telegram.ui.Components.s90 s90Var) {
        this.f40542b = kh0Var;
        this.f40541a = s90Var;
    }

    @Override
    public final void d() {
        lh0.X(this.f40542b.d);
    }

    @Override
    public final void e() {
        kh0 kh0Var = this.f40542b;
        lh0 lh0Var = kh0Var.d;
        Context context = this.f40541a.getContext();
        lh0 lh0Var2 = kh0Var.d;
        lh0Var.f41176l0 = new org.telegram.ui.Components.o70(context, lh0Var2.e, lh0Var2.d, lh0Var2.f41175k0, lh0Var2, lh0Var2.f41177n, true, lh0Var2.h);
        kh0Var.d.f41176l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
