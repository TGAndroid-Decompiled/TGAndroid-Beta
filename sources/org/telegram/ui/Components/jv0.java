package org.telegram.ui.Components;

import android.content.Context;
public final class jv0 {
    public final int f25463a;
    public final int f25464b;
    public final iv0 f25465c;
    public final hv0 d;
    public final kv0 e;

    public jv0(kv0 kv0Var, Context context, int i10) {
        this.e = kv0Var;
        this.f25464b = i10;
        int i11 = kv0Var.a2;
        kv0Var.a2 = i11 + 1;
        this.f25463a = (i11 & 65535) | 65536;
        this.f25465c = new iv0(this, context, i10);
        this.d = new hv0(kv0Var, context, i10, false);
    }
}
