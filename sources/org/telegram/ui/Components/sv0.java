package org.telegram.ui.Components;

import android.content.Context;
public final class sv0 {
    public final int f30335a;
    public final int f30336b;
    public final rv0 f30337c;
    public final qv0 d;
    public final tv0 e;

    public sv0(tv0 tv0Var, Context context, int i10) {
        this.e = tv0Var;
        this.f30336b = i10;
        int i11 = tv0Var.a2;
        tv0Var.a2 = i11 + 1;
        this.f30335a = (i11 & 65535) | 65536;
        this.f30337c = new rv0(this, context, i10);
        this.d = new qv0(tv0Var, context, i10, false);
    }
}
