package org.telegram.ui.Components;

import android.content.Context;
public final class it0 {
    public final int f36266a;
    public final int f36267b;
    public final ht0 f36268c;
    public final gt0 d;
    public final jt0 f36269e;

    public it0(jt0 jt0Var, Context context, int i7) {
        this.f36269e = jt0Var;
        this.f36267b = i7;
        int i10 = jt0Var.f36609o2;
        jt0Var.f36609o2 = i10 + 1;
        this.f36266a = (i10 & 65535) | 65536;
        this.f36268c = new ht0(this, context, i7);
        this.d = new gt0(jt0Var, context, i7, false);
    }
}
