package org.telegram.ui;

import android.content.Context;
public final class fb1 extends ra1 {
    public final int v;
    public final int f35781w;
    public int f35782x;
    public bi f35783y;

    public fb1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f35781w = i12;
    }

    @Override
    public final void b(ta1 ta1Var) {
        int i10;
        if (ta1Var != null && (i10 = this.f35782x) >= 0) {
            ta1Var.a(this.v, this.f35781w, i10, this.f35783y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
