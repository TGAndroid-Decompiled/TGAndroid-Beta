package org.telegram.ui.Components;

import android.content.Context;
public final class xs0 {
    public final int f41750a;
    public final int f41751b;
    public final ws0 f41752c;
    public final vs0 d;
    public final ys0 f41753e;

    public xs0(ys0 ys0Var, Context context, int i7) {
        this.f41753e = ys0Var;
        this.f41751b = i7;
        int i10 = ys0Var.f42123o2;
        ys0Var.f42123o2 = i10 + 1;
        this.f41750a = (i10 & 65535) | 65536;
        this.f41752c = new ws0(this, context, i7);
        this.d = new vs0(ys0Var, context, i7, false);
    }
}
