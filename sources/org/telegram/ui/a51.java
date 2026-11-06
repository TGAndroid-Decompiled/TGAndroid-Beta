package org.telegram.ui;

import android.content.Context;
public final class a51 extends l41 {
    public eh D;
    public final int f43546w;
    public final int f43547x;
    public int f43548y;

    public a51(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f43546w = i7;
        this.f43547x = i11;
    }

    @Override
    public final void b(o41 o41Var) {
        int i7;
        if (o41Var != null && (i7 = this.f43548y) >= 0) {
            o41Var.a(this.f43546w, this.f43547x, i7, this.D);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
