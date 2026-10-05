package org.telegram.ui.Components;

import android.content.Context;
public final class pv0 {
    public final int f29850a;
    public final int f29851b;
    public final ov0 f29852c;
    public final nv0 d;
    public final qv0 f29853e;

    public pv0(qv0 qv0Var, Context context, int i10) {
        this.f29853e = qv0Var;
        this.f29851b = i10;
        int i11 = qv0Var.a2;
        qv0Var.a2 = i11 + 1;
        this.f29850a = (i11 & 65535) | 65536;
        this.f29852c = new ov0(this, context, i10);
        this.d = new nv0(qv0Var, context, i10, false);
    }
}
