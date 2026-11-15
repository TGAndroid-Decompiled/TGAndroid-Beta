package org.telegram.ui.Components;

import android.content.Context;
public final class xs0 {
    public final int f41758a;
    public final int f41759b;
    public final ws0 f41760c;
    public final vs0 d;
    public final ys0 f41761e;

    public xs0(ys0 ys0Var, Context context, int i7) {
        this.f41761e = ys0Var;
        this.f41759b = i7;
        int i10 = ys0Var.f42121o2;
        ys0Var.f42121o2 = i10 + 1;
        this.f41758a = (i10 & 65535) | 65536;
        this.f41760c = new ws0(this, context, i7);
        this.d = new vs0(ys0Var, context, i7, false);
    }
}
