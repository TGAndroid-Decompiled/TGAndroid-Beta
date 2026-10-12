package org.telegram.ui;

import android.content.Context;
public final class bb1 extends na1 {
    public final int v;
    public final int f36128w;
    public int f36129x;
    public bi f36130y;

    public bb1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36128w = i12;
    }

    @Override
    public final void b(pa1 pa1Var) {
        int i10;
        if (pa1Var != null && (i10 = this.f36129x) >= 0) {
            pa1Var.a(this.v, this.f36128w, i10, this.f36130y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
