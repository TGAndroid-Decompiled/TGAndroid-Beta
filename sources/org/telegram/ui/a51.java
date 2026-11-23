package org.telegram.ui;

import android.content.Context;
public final class a51 extends m41 {
    public fh E;
    public final int f45505w;
    public final int f45506x;
    public int f45507y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f45505w = i7;
        this.f45506x = i11;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var != null && (i7 = this.f45507y) >= 0) {
            o41Var.a(this.f45505w, this.f45506x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
