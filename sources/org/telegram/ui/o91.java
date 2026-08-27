package org.telegram.ui;

import android.content.Context;

public final class o91 extends a91 {
    public final int v;

    public final int f41041w;

    public int f41042x;

    public org.telegram.ui.Components.x41 f41043y;

    public o91(Context context, int i10, int i11, rf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f41041w = i12;
    }

    @Override
    public final void b(c91 c91Var) {
        int i10;
        if (c91Var == null || (i10 = this.f41042x) < 0) {
            return;
        }
        c91Var.a(this.v, this.f41041w, i10, this.f41043y);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
