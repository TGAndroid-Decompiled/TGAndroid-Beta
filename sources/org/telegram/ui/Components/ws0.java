package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 {
    public final int f40070a;
    public final int f40071b;
    public final vs0 f40072c;
    public final us0 d;
    public final xs0 f40073e;

    public ws0(xs0 xs0Var, Context context, int i7) {
        this.f40073e = xs0Var;
        this.f40071b = i7;
        int i10 = xs0Var.f40377n2;
        xs0Var.f40377n2 = i10 + 1;
        this.f40070a = (i10 & 65535) | 65536;
        this.f40072c = new vs0(this, context, i7);
        this.d = new us0(xs0Var, context, i7, false);
    }
}
