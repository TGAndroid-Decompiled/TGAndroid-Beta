package org.telegram.ui;

import android.content.Context;
public final class fa1 extends r91 {
    public final int v;
    public final int f36830w;
    public int f36831x;
    public org.telegram.ui.Components.t51 f36832y;

    public fa1(Context context, int i10, int i11, wf.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36830w = i12;
    }

    @Override
    public final void b(t91 t91Var) {
        int i10;
        if (t91Var != null && (i10 = this.f36831x) >= 0) {
            t91Var.a(this.v, this.f36830w, i10, this.f36832y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
