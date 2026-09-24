package org.telegram.ui;

import android.content.Context;
public final class qa1 extends ca1 {
    public final int v;
    public final int f36828w;
    public int f36829x;
    public org.telegram.ui.Components.f61 f36830y;

    public qa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36828w = i12;
    }

    @Override
    public final void b(ea1 ea1Var) {
        int i10;
        if (ea1Var != null && (i10 = this.f36829x) >= 0) {
            ea1Var.a(this.v, this.f36828w, i10, this.f36830y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
