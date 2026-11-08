package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 {
    public final int f40037a;
    public final int f40038b;
    public final vs0 f40039c;
    public final us0 d;
    public final xs0 f40040e;

    public ws0(xs0 xs0Var, Context context, int i7) {
        this.f40040e = xs0Var;
        this.f40038b = i7;
        int i10 = xs0Var.f40433n2;
        xs0Var.f40433n2 = i10 + 1;
        this.f40037a = (i10 & 65535) | 65536;
        this.f40039c = new vs0(this, context, i7);
        this.d = new us0(xs0Var, context, i7, false);
    }
}
