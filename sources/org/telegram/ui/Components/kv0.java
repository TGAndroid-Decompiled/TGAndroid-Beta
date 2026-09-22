package org.telegram.ui.Components;

import android.content.Context;
public final class kv0 {
    public final int f25825a;
    public final int f25826b;
    public final jv0 f25827c;
    public final iv0 d;
    public final lv0 e;

    public kv0(lv0 lv0Var, Context context, int i10) {
        this.e = lv0Var;
        this.f25826b = i10;
        int i11 = lv0Var.a2;
        lv0Var.a2 = i11 + 1;
        this.f25825a = (i11 & 65535) | 65536;
        this.f25827c = new jv0(this, context, i10);
        this.d = new iv0(lv0Var, context, i10, false);
    }
}
