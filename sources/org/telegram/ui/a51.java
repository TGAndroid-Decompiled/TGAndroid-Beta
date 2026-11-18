package org.telegram.ui;

import android.content.Context;
public final class a51 extends m41 {
    public eh E;
    public final int f45461w;
    public final int f45462x;
    public int f45463y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f45461w = i7;
        this.f45462x = i11;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var != null && (i7 = this.f45463y) >= 0) {
            o41Var.a(this.f45461w, this.f45462x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
