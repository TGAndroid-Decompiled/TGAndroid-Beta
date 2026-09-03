package org.telegram.ui;

import android.content.Context;
public final class la1 extends x91 {
    public final int v;
    public final int f38600w;
    public int f38601x;
    public org.telegram.ui.Components.s51 f38602y;

    public la1(Context context, int i10, int i11, wf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f38600w = i12;
    }

    @Override
    public final void b(z91 z91Var) {
        int i10;
        if (z91Var != null && (i10 = this.f38601x) >= 0) {
            z91Var.a(this.v, this.f38600w, i10, this.f38602y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
