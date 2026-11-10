package org.telegram.ui.Components;

import android.content.Context;
public final class xs0 {
    public final int f40395a;
    public final int f40396b;
    public final ws0 f40397c;
    public final vs0 d;
    public final ys0 f40398e;

    public xs0(ys0 ys0Var, Context context, int i7) {
        this.f40398e = ys0Var;
        this.f40396b = i7;
        int i10 = ys0Var.f40691n2;
        ys0Var.f40691n2 = i10 + 1;
        this.f40395a = (i10 & 65535) | 65536;
        this.f40397c = new ws0(this, context, i7);
        this.d = new vs0(ys0Var, context, i7, false);
    }
}
