package org.telegram.ui.Components;

import android.content.Context;
public final class ht0 {
    public final int f35816a;
    public final int f35817b;
    public final gt0 f35818c;
    public final ft0 d;
    public final it0 f35819e;

    public ht0(it0 it0Var, Context context, int i7) {
        this.f35819e = it0Var;
        this.f35817b = i7;
        int i10 = it0Var.f36137o2;
        it0Var.f36137o2 = i10 + 1;
        this.f35816a = (i10 & 65535) | 65536;
        this.f35818c = new gt0(this, context, i7);
        this.d = new ft0(it0Var, context, i7, false);
    }
}
