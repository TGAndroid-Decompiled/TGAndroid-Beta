package org.telegram.ui;

import android.content.Context;
public final class b51 extends m41 {
    public gh D;
    public final int f43903w;
    public final int f43904x;
    public int f43905y;

    public b51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f43903w = i7;
        this.f43904x = i11;
    }

    @Override
    public final void b(p41 p41Var) {
        int i7;
        if (p41Var != null && (i7 = this.f43905y) >= 0) {
            p41Var.a(this.f43903w, this.f43904x, i7, this.D);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
