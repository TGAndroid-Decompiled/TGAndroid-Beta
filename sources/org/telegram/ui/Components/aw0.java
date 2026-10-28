package org.telegram.ui.Components;

import android.content.Context;
public final class aw0 {
    public final int f26682a;
    public final int f26683b;
    public final zv0 f26684c;
    public final yv0 d;
    public final bw0 e;

    public aw0(bw0 bw0Var, Context context, int i10) {
        this.e = bw0Var;
        this.f26683b = i10;
        int i11 = bw0Var.f26961l2;
        bw0Var.f26961l2 = i11 + 1;
        this.f26682a = (i11 & 65535) | 65536;
        this.f26684c = new zv0(this, context, i10);
        this.d = new yv0(bw0Var, context, i10, false);
    }
}
