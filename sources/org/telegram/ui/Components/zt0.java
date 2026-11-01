package org.telegram.ui.Components;

import android.content.Context;
public final class zt0 {
    public final int f33222a;
    public final int f33223b;
    public final yt0 f33224c;
    public final xt0 d;
    public final au0 e;

    public zt0(au0 au0Var, Context context, int i10) {
        this.e = au0Var;
        this.f33223b = i10;
        int i11 = au0Var.f24540n2;
        au0Var.f24540n2 = i11 + 1;
        this.f33222a = (i11 & 65535) | 65536;
        this.f33224c = new yt0(this, context, i10);
        this.d = new xt0(au0Var, context, i10, false);
    }
}
