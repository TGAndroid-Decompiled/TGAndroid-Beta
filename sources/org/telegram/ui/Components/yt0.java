package org.telegram.ui.Components;

import android.content.Context;
public final class yt0 {
    public final int f32788a;
    public final int f32789b;
    public final xt0 f32790c;
    public final wt0 d;
    public final zt0 e;

    public yt0(zt0 zt0Var, Context context, int i10) {
        this.e = zt0Var;
        this.f32789b = i10;
        int i11 = zt0Var.f33212n2;
        zt0Var.f33212n2 = i11 + 1;
        this.f32788a = (i11 & 65535) | 65536;
        this.f32790c = new xt0(this, context, i10);
        this.d = new wt0(zt0Var, context, i10, false);
    }
}
