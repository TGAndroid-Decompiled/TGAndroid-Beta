package org.telegram.ui;

import android.content.Context;
public final class q91 extends c91 {
    public final int v;
    public final int f41727w;
    public int f41728x;
    public org.telegram.ui.Components.v41 f41729y;

    public q91(Context context, int i9, int i10, qf.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.v = i9;
        this.f41727w = i11;
    }

    @Override
    public final void b(e91 e91Var) {
        int i9;
        if (e91Var != null && (i9 = this.f41728x) >= 0) {
            e91Var.a(this.v, this.f41727w, i9, this.f41729y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
