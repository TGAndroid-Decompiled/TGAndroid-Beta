package org.telegram.ui.Components;

import android.content.Context;
public final class hv0 {
    public final int f23765a;
    public final int f23766b;
    public final gv0 f23767c;
    public final fv0 d;
    public final iv0 e;

    public hv0(iv0 iv0Var, Context context, int i10) {
        this.e = iv0Var;
        this.f23766b = i10;
        int i11 = iv0Var.a2;
        iv0Var.a2 = i11 + 1;
        this.f23765a = (i11 & 65535) | 65536;
        this.f23767c = new gv0(this, context, i10);
        this.d = new fv0(iv0Var, context, i10, false);
    }
}
