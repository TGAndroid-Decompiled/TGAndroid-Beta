package org.telegram.ui.Components;

import android.content.Context;
public final class wu0 {
    public final int f32370a;
    public final int f32371b;
    public final vu0 f32372c;
    public final uu0 d;
    public final xu0 f32373e;

    public wu0(xu0 xu0Var, Context context, int i10) {
        this.f32373e = xu0Var;
        this.f32371b = i10;
        int i11 = xu0Var.a2;
        xu0Var.a2 = i11 + 1;
        this.f32370a = (i11 & 65535) | 65536;
        this.f32372c = new vu0(this, context, i10);
        this.d = new uu0(xu0Var, context, i10, false);
    }
}
