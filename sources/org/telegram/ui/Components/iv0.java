package org.telegram.ui.Components;

import android.content.Context;
public final class iv0 {
    public final int f25173a;
    public final int f25174b;
    public final hv0 f25175c;
    public final gv0 d;
    public final jv0 e;

    public iv0(jv0 jv0Var, Context context, int i10) {
        this.e = jv0Var;
        this.f25174b = i10;
        int i11 = jv0Var.a2;
        jv0Var.a2 = i11 + 1;
        this.f25173a = (i11 & 65535) | 65536;
        this.f25175c = new hv0(this, context, i10);
        this.d = new gv0(jv0Var, context, i10, false);
    }
}
