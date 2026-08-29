package org.telegram.ui.Components;

import android.content.Context;
public final class pu0 {
    public final int f31773a;
    public final int f31774b;
    public final ou0 f31775c;
    public final nu0 d;
    public final qu0 f31776e;

    public pu0(qu0 qu0Var, Context context, int i10) {
        this.f31776e = qu0Var;
        this.f31774b = i10;
        int i11 = qu0Var.W1;
        qu0Var.W1 = i11 + 1;
        this.f31773a = (i11 & 65535) | 65536;
        this.f31775c = new ou0(this, context, i10);
        this.d = new nu0(qu0Var, context, i10, false);
    }
}
