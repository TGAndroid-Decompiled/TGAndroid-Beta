package org.telegram.ui;

import android.content.Context;
public final class c51 extends n41 {
    public gh D;
    public final int f44246w;
    public final int f44247x;
    public int f44248y;

    public c51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f44246w = i7;
        this.f44247x = i11;
    }

    @Override
    public final void b(q41 q41Var) {
        int i7;
        if (q41Var != null && (i7 = this.f44248y) >= 0) {
            q41Var.a(this.f44246w, this.f44247x, i7, this.D);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
