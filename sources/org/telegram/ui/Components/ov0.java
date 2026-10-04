package org.telegram.ui.Components;

import android.content.Context;
public final class ov0 {
    public final int f29455a;
    public final int f29456b;
    public final nv0 f29457c;
    public final mv0 d;
    public final pv0 f29458e;

    public ov0(pv0 pv0Var, Context context, int i10) {
        this.f29458e = pv0Var;
        this.f29456b = i10;
        int i11 = pv0Var.a2;
        pv0Var.a2 = i11 + 1;
        this.f29455a = (i11 & 65535) | 65536;
        this.f29457c = new nv0(this, context, i10);
        this.d = new mv0(pv0Var, context, i10, false);
    }
}
