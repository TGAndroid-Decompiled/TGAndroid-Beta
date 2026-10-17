package org.telegram.ui;

import android.content.Context;
public final class p91 extends b91 {
    public final int v;
    public final int f40023w;
    public int f40024x;
    public qh f40025y;

    public p91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40023w = i12;
    }

    @Override
    public final void b(d91 d91Var) {
        int i10;
        if (d91Var != null && (i10 = this.f40024x) >= 0) {
            d91Var.a(this.v, this.f40023w, i10, this.f40025y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
