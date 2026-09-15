package org.telegram.ui.Components;

import android.content.Context;
public final class xu0 {
    public final int f30066a;
    public final int f30067b;
    public final wu0 f30068c;
    public final vu0 d;
    public final yu0 e;

    public xu0(yu0 yu0Var, Context context, int i10) {
        this.e = yu0Var;
        this.f30067b = i10;
        int i11 = yu0Var.a2;
        yu0Var.a2 = i11 + 1;
        this.f30066a = (i11 & 65535) | 65536;
        this.f30068c = new wu0(this, context, i10);
        this.d = new vu0(yu0Var, context, i10, false);
    }
}
