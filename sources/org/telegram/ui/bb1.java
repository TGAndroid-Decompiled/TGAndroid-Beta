package org.telegram.ui;

import android.content.Context;
public final class bb1 extends na1 {
    public final int v;
    public final int f36126w;
    public int f36127x;
    public bi f36128y;

    public bb1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36126w = i12;
    }

    @Override
    public final void b(pa1 pa1Var) {
        int i10;
        if (pa1Var != null && (i10 = this.f36127x) >= 0) {
            pa1Var.a(this.v, this.f36126w, i10, this.f36128y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
