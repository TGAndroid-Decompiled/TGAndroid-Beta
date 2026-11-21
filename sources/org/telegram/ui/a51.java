package org.telegram.ui;

import android.content.Context;
public final class a51 extends m41 {
    public fh E;
    public final int f45501w;
    public final int f45502x;
    public int f45503y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f45501w = i7;
        this.f45502x = i11;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var != null && (i7 = this.f45503y) >= 0) {
            o41Var.a(this.f45501w, this.f45502x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
