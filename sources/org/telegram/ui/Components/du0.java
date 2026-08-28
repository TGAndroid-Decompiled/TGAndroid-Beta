package org.telegram.ui.Components;

import android.content.Context;
public final class du0 {
    public final int f27810a;
    public final int f27811b;
    public final cu0 f27812c;
    public final bu0 d;
    public final eu0 f27813e;

    public du0(eu0 eu0Var, Context context, int i9) {
        this.f27813e = eu0Var;
        this.f27811b = i9;
        int i10 = eu0Var.W1;
        eu0Var.W1 = i10 + 1;
        this.f27810a = (i10 & 65535) | 65536;
        this.f27812c = new cu0(this, context, i9);
        this.d = new bu0(eu0Var, context, i9, false);
    }
}
