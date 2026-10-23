package org.telegram.ui.Components;

import android.content.Context;
public final class wv0 {
    public final int f32355a;
    public final int f32356b;
    public final vv0 f32357c;
    public final uv0 d;
    public final xv0 e;

    public wv0(xv0 xv0Var, Context context, int i10) {
        this.e = xv0Var;
        this.f32356b = i10;
        int i11 = xv0Var.f32664b2;
        xv0Var.f32664b2 = i11 + 1;
        this.f32355a = (i11 & 65535) | 65536;
        this.f32357c = new vv0(this, context, i10);
        this.d = new uv0(xv0Var, context, i10, false);
    }
}
