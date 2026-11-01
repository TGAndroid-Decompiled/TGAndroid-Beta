package org.telegram.ui;

import android.content.Context;
public final class q61 extends c61 {
    public uh D;
    public final int f40701w;
    public final int f40702x;
    public int f40703y;

    public q61(Context context, int i10, int i11, bg.h hVar, int i12) {
        super(context, i11, hVar, null);
        this.f40701w = i10;
        this.f40702x = i12;
    }

    @Override
    public final void b(e61 e61Var) {
        int i10;
        if (e61Var != null && (i10 = this.f40703y) >= 0) {
            e61Var.a(this.f40701w, this.f40702x, i10, this.D);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
