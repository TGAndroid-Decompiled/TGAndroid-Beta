package org.telegram.ui.Components;

import android.content.Context;
public final class yu0 {
    public final int f30325a;
    public final int f30326b;
    public final xu0 f30327c;
    public final wu0 d;
    public final zu0 e;

    public yu0(zu0 zu0Var, Context context, int i10) {
        this.e = zu0Var;
        this.f30326b = i10;
        int i11 = zu0Var.a2;
        zu0Var.a2 = i11 + 1;
        this.f30325a = (i11 & 65535) | 65536;
        this.f30327c = new xu0(this, context, i10);
        this.d = new wu0(zu0Var, context, i10, false);
    }
}
