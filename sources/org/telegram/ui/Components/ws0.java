package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 {
    public final int f40085a;
    public final int f40086b;
    public final vs0 f40087c;
    public final us0 d;
    public final xs0 f40088e;

    public ws0(xs0 xs0Var, Context context, int i7) {
        this.f40088e = xs0Var;
        this.f40086b = i7;
        int i10 = xs0Var.f40412n2;
        xs0Var.f40412n2 = i10 + 1;
        this.f40085a = (i10 & 65535) | 65536;
        this.f40087c = new vs0(this, context, i7);
        this.d = new us0(xs0Var, context, i7, false);
    }
}
