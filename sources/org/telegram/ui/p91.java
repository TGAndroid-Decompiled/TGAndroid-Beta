package org.telegram.ui;

import android.content.Context;
public final class p91 extends b91 {
    public final int v;
    public final int f40003w;
    public int f40004x;
    public qh f40005y;

    public p91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40003w = i12;
    }

    @Override
    public final void b(d91 d91Var) {
        int i10;
        if (d91Var != null && (i10 = this.f40004x) >= 0) {
            d91Var.a(this.v, this.f40003w, i10, this.f40005y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
