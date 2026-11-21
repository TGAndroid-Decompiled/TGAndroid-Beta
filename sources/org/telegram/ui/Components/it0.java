package org.telegram.ui.Components;

import android.content.Context;
public final class it0 {
    public final int f36314a;
    public final int f36315b;
    public final ht0 f36316c;
    public final gt0 d;
    public final jt0 f36317e;

    public it0(jt0 jt0Var, Context context, int i7) {
        this.f36317e = jt0Var;
        this.f36315b = i7;
        int i10 = jt0Var.f36660o2;
        jt0Var.f36660o2 = i10 + 1;
        this.f36314a = (i10 & 65535) | 65536;
        this.f36316c = new ht0(this, context, i7);
        this.d = new gt0(jt0Var, context, i7, false);
    }
}
