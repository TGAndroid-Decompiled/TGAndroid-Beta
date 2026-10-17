package org.telegram.ui.Components;

import android.content.Context;
public final class rv0 {
    public final int f30057a;
    public final int f30058b;
    public final qv0 f30059c;
    public final pv0 d;
    public final sv0 e;

    public rv0(sv0 sv0Var, Context context, int i10) {
        this.e = sv0Var;
        this.f30058b = i10;
        int i11 = sv0Var.a2;
        sv0Var.a2 = i11 + 1;
        this.f30057a = (i11 & 65535) | 65536;
        this.f30059c = new qv0(this, context, i10);
        this.d = new pv0(sv0Var, context, i10, false);
    }
}
