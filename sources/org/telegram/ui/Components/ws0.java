package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 {
    public final int f40077a;
    public final int f40078b;
    public final vs0 f40079c;
    public final us0 d;
    public final xs0 f40080e;

    public ws0(xs0 xs0Var, Context context, int i7) {
        this.f40080e = xs0Var;
        this.f40078b = i7;
        int i10 = xs0Var.f40396n2;
        xs0Var.f40396n2 = i10 + 1;
        this.f40077a = (i10 & 65535) | 65536;
        this.f40079c = new vs0(this, context, i7);
        this.d = new us0(xs0Var, context, i7, false);
    }
}
