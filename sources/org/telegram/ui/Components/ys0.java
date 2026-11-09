package org.telegram.ui.Components;

import android.content.Context;
public final class ys0 {
    public final int f40800a;
    public final int f40801b;
    public final xs0 f40802c;
    public final ws0 d;
    public final zs0 f40803e;

    public ys0(zs0 zs0Var, Context context, int i7) {
        this.f40803e = zs0Var;
        this.f40801b = i7;
        int i10 = zs0Var.f41099n2;
        zs0Var.f41099n2 = i10 + 1;
        this.f40800a = (i10 & 65535) | 65536;
        this.f40802c = new xs0(this, context, i7);
        this.d = new ws0(zs0Var, context, i7, false);
    }
}
