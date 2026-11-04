package org.telegram.ui;

import android.content.Context;
public final class p41 extends b41 {
    public ah E;
    public final int f48463w;
    public final int f48464x;
    public int f48465y;

    public p41(Context context, int i3, int i10, mg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f48463w = i3;
        this.f48464x = i11;
    }

    @Override
    public final void b(d41 d41Var) {
        int i3;
        if (d41Var != null && (i3 = this.f48465y) >= 0) {
            d41Var.a(this.f48463w, this.f48464x, i3, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
