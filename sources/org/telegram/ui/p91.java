package org.telegram.ui;

import android.content.Context;
public final class p91 extends b91 {
    public final int v;
    public final int f40042w;
    public int f40043x;
    public qh f40044y;

    public p91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40042w = i12;
    }

    @Override
    public final void b(d91 d91Var) {
        int i10;
        if (d91Var != null && (i10 = this.f40043x) >= 0) {
            d91Var.a(this.v, this.f40042w, i10, this.f40044y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
