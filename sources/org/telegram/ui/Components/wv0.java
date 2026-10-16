package org.telegram.ui.Components;

import android.content.Context;
public final class wv0 {
    public final int f30672a;
    public final int f30673b;
    public final vv0 f30674c;
    public final uv0 d;
    public final xv0 e;

    public wv0(xv0 xv0Var, Context context, int i10) {
        this.e = xv0Var;
        this.f30673b = i10;
        int i11 = xv0Var.a2;
        xv0Var.a2 = i11 + 1;
        this.f30672a = (i11 & 65535) | 65536;
        this.f30674c = new vv0(this, context, i10);
        this.d = new uv0(xv0Var, context, i10, false);
    }
}
