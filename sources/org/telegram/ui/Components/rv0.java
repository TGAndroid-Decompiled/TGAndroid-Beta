package org.telegram.ui.Components;

import android.content.Context;
public final class rv0 {
    public final int f30065a;
    public final int f30066b;
    public final qv0 f30067c;
    public final pv0 d;
    public final sv0 e;

    public rv0(sv0 sv0Var, Context context, int i10) {
        this.e = sv0Var;
        this.f30066b = i10;
        int i11 = sv0Var.a2;
        sv0Var.a2 = i11 + 1;
        this.f30065a = (i11 & 65535) | 65536;
        this.f30067c = new qv0(this, context, i10);
        this.d = new pv0(sv0Var, context, i10, false);
    }
}
