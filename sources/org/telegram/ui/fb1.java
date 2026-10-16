package org.telegram.ui;

import android.content.Context;
public final class fb1 extends ra1 {
    public final int v;
    public final int f35500w;
    public int f35501x;
    public bi f35502y;

    public fb1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f35500w = i12;
    }

    @Override
    public final void b(ta1 ta1Var) {
        int i10;
        if (ta1Var != null && (i10 = this.f35501x) >= 0) {
            ta1Var.a(this.v, this.f35500w, i10, this.f35502y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
