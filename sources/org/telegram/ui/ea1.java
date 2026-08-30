package org.telegram.ui;

import android.content.Context;
public final class ea1 extends q91 {
    public final int v;
    public final int f33970w;
    public int f33971x;
    public org.telegram.ui.Components.s51 f33972y;

    public ea1(Context context, int i10, int i11, vf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f33970w = i12;
    }

    @Override
    public final void b(s91 s91Var) {
        int i10;
        if (s91Var != null && (i10 = this.f33971x) >= 0) {
            s91Var.a(this.v, this.f33970w, i10, this.f33972y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
