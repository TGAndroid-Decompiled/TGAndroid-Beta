package org.telegram.ui.Components;

import android.content.Context;
public final class cw0 {
    public final int f25332a;
    public final int f25333b;
    public final bw0 f25334c;
    public final aw0 d;
    public final dw0 f25335e;

    public cw0(dw0 dw0Var, Context context, int i10) {
        this.f25335e = dw0Var;
        this.f25333b = i10;
        int i11 = dw0Var.a2;
        dw0Var.a2 = i11 + 1;
        this.f25332a = (i11 & 65535) | 65536;
        this.f25334c = new bw0(this, context, i10);
        this.d = new aw0(dw0Var, context, i10, false);
    }
}
