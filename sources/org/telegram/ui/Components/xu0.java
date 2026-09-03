package org.telegram.ui.Components;

import android.content.Context;
public final class xu0 {
    public final int f33177a;
    public final int f33178b;
    public final wu0 f33179c;
    public final vu0 d;
    public final yu0 f33180e;

    public xu0(yu0 yu0Var, Context context, int i10) {
        this.f33180e = yu0Var;
        this.f33178b = i10;
        int i11 = yu0Var.X1;
        yu0Var.X1 = i11 + 1;
        this.f33177a = (i11 & 65535) | 65536;
        this.f33179c = new wu0(this, context, i10);
        this.d = new vu0(yu0Var, context, i10, false);
    }
}
