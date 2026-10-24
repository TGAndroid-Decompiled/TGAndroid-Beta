package org.telegram.ui.Components;

import android.content.Context;
public final class vv0 {
    public final int f32053a;
    public final int f32054b;
    public final uv0 f32055c;
    public final tv0 d;
    public final wv0 e;

    public vv0(wv0 wv0Var, Context context, int i10) {
        this.e = wv0Var;
        this.f32054b = i10;
        int i11 = wv0Var.f32363b2;
        wv0Var.f32363b2 = i11 + 1;
        this.f32053a = (i11 & 65535) | 65536;
        this.f32055c = new uv0(this, context, i10);
        this.d = new tv0(wv0Var, context, i10, false);
    }
}
