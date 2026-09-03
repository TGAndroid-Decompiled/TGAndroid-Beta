package org.telegram.ui;

import android.content.Context;
public final class ma1 extends y91 {
    public final int v;
    public final int f36014w;
    public int f36015x;
    public org.telegram.ui.Components.s51 f36016y;

    public ma1(Context context, int i10, int i11, vf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36014w = i12;
    }

    @Override
    public final void b(aa1 aa1Var) {
        int i10;
        if (aa1Var != null && (i10 = this.f36015x) >= 0) {
            aa1Var.a(this.v, this.f36014w, i10, this.f36016y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
