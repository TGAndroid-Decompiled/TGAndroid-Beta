package org.telegram.ui;

import android.content.Context;
public final class kh0 implements org.telegram.ui.Components.q90 {
    public final org.telegram.ui.Components.r90 f38951a;
    public final lh0 f38952b;

    public kh0(lh0 lh0Var, org.telegram.ui.Components.r90 r90Var) {
        this.f38952b = lh0Var;
        this.f38951a = r90Var;
    }

    @Override
    public final void c() {
        mh0.W(this.f38952b.d);
    }

    @Override
    public final void j() {
        lh0 lh0Var = this.f38952b;
        mh0 mh0Var = lh0Var.d;
        Context context = this.f38951a.getContext();
        mh0 mh0Var2 = lh0Var.d;
        mh0Var.f39591l0 = new org.telegram.ui.Components.m70(context, mh0Var2.e, mh0Var2.d, mh0Var2.f39590k0, mh0Var2, mh0Var2.f39592n, true, mh0Var2.h);
        lh0Var.d.f39591l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
