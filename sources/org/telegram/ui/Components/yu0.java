package org.telegram.ui.Components;

import android.content.Context;
public final class yu0 {
    public final int f30328a;
    public final int f30329b;
    public final xu0 f30330c;
    public final wu0 d;
    public final zu0 e;

    public yu0(zu0 zu0Var, Context context, int i10) {
        this.e = zu0Var;
        this.f30329b = i10;
        int i11 = zu0Var.a2;
        zu0Var.a2 = i11 + 1;
        this.f30328a = (i11 & 65535) | 65536;
        this.f30330c = new xu0(this, context, i10);
        this.d = new wu0(zu0Var, context, i10, false);
    }
}
