package org.telegram.ui.Components;

import android.content.Context;
public final class gw0 {
    public final int f26543a;
    public final int f26544b;
    public final fw0 f26545c;
    public final ew0 d;
    public final hw0 f26546e;

    public gw0(hw0 hw0Var, Context context, int i10) {
        this.f26546e = hw0Var;
        this.f26544b = i10;
        int i11 = hw0Var.a2;
        hw0Var.a2 = i11 + 1;
        this.f26543a = (i11 & 65535) | 65536;
        this.f26545c = new fw0(this, context, i10);
        this.d = new ew0(hw0Var, context, i10, false);
    }
}
