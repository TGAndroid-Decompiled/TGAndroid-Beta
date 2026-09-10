package org.telegram.ui;

import android.content.Context;
public final class db1 extends pa1 {
    public final int v;
    public final int f31876w;
    public int f31877x;
    public org.telegram.ui.Components.f61 f31878y;

    public db1(Context context, int i10, int i11, hg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f31876w = i12;
    }

    @Override
    public final void b(ra1 ra1Var) {
        int i10;
        if (ra1Var != null && (i10 = this.f31877x) >= 0) {
            ra1Var.a(this.v, this.f31876w, i10, this.f31878y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
