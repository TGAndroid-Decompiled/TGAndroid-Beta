package org.telegram.ui.Components;

import android.content.Context;
public final class vs0 {
    public final int f39780a;
    public final int f39781b;
    public final us0 f39782c;
    public final ts0 d;
    public final ws0 f39783e;

    public vs0(ws0 ws0Var, Context context, int i3) {
        this.f39783e = ws0Var;
        this.f39781b = i3;
        int i10 = ws0Var.f40113o2;
        ws0Var.f40113o2 = i10 + 1;
        this.f39780a = (i10 & 65535) | 65536;
        this.f39782c = new us0(this, context, i3);
        this.d = new ts0(ws0Var, context, i3, false);
    }
}
