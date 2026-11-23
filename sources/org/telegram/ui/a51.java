package org.telegram.ui;

import android.content.Context;
public final class a51 extends m41 {
    public eh E;
    public final int f45471w;
    public final int f45472x;
    public int f45473y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f45471w = i7;
        this.f45472x = i11;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var != null && (i7 = this.f45473y) >= 0) {
            o41Var.a(this.f45471w, this.f45472x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
