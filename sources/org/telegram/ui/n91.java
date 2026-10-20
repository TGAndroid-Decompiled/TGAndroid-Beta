package org.telegram.ui;

import android.content.Context;
public final class n91 extends z81 {
    public final int v;
    public final int f39484w;
    public int f39485x;
    public oh f39486y;

    public n91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f39484w = i12;
    }

    @Override
    public final void b(b91 b91Var) {
        int i10;
        if (b91Var != null && (i10 = this.f39485x) >= 0) {
            b91Var.a(this.v, this.f39484w, i10, this.f39486y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
