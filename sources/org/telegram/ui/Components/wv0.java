package org.telegram.ui.Components;

import android.content.Context;
public final class wv0 {
    public final int f30980a;
    public final int f30981b;
    public final vv0 f30982c;
    public final uv0 d;
    public final xv0 e;

    public wv0(xv0 xv0Var, Context context, int i10) {
        this.e = xv0Var;
        this.f30981b = i10;
        int i11 = xv0Var.a2;
        xv0Var.a2 = i11 + 1;
        this.f30980a = (i11 & 65535) | 65536;
        this.f30982c = new vv0(this, context, i10);
        this.d = new uv0(xv0Var, context, i10, false);
    }
}
