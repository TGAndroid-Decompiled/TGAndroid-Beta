package org.telegram.ui.Components;

import android.content.Context;
public final class ft0 {
    public final int f35164a;
    public final int f35165b;
    public final et0 f35166c;
    public final dt0 d;
    public final gt0 f35167e;

    public ft0(gt0 gt0Var, Context context, int i7) {
        this.f35167e = gt0Var;
        this.f35165b = i7;
        int i10 = gt0Var.f35613o2;
        gt0Var.f35613o2 = i10 + 1;
        this.f35164a = (i10 & 65535) | 65536;
        this.f35166c = new et0(this, context, i7);
        this.d = new dt0(gt0Var, context, i7, false);
    }
}
