package org.telegram.ui.Components;

import android.content.Context;
public final class yu0 {
    public final int f33579a;
    public final int f33580b;
    public final xu0 f33581c;
    public final wu0 d;
    public final zu0 f33582e;

    public yu0(zu0 zu0Var, Context context, int i10) {
        this.f33582e = zu0Var;
        this.f33580b = i10;
        int i11 = zu0Var.X1;
        zu0Var.X1 = i11 + 1;
        this.f33579a = (i11 & 65535) | 65536;
        this.f33581c = new xu0(this, context, i10);
        this.d = new wu0(zu0Var, context, i10, false);
    }
}
