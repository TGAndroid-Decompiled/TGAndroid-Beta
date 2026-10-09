package org.telegram.ui.Components;

import android.content.Context;
public final class aw0 {
    public final int f24783a;
    public final int f24784b;
    public final zv0 f24785c;
    public final yv0 d;
    public final bw0 f24786e;

    public aw0(bw0 bw0Var, Context context, int i10) {
        this.f24786e = bw0Var;
        this.f24784b = i10;
        int i11 = bw0Var.a2;
        bw0Var.a2 = i11 + 1;
        this.f24783a = (i11 & 65535) | 65536;
        this.f24785c = new zv0(this, context, i10);
        this.d = new yv0(bw0Var, context, i10, false);
    }
}
