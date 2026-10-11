package org.telegram.ui.Components;

import android.content.Context;
public final class bw0 {
    public final int f25105a;
    public final int f25106b;
    public final aw0 f25107c;
    public final zv0 d;
    public final cw0 f25108e;

    public bw0(cw0 cw0Var, Context context, int i10) {
        this.f25108e = cw0Var;
        this.f25106b = i10;
        int i11 = cw0Var.a2;
        cw0Var.a2 = i11 + 1;
        this.f25105a = (i11 & 65535) | 65536;
        this.f25107c = new aw0(this, context, i10);
        this.d = new zv0(cw0Var, context, i10, false);
    }
}
