package org.telegram.ui.Components;

import android.content.Context;
public final class zv0 {
    public final int f35409a;
    public final int f35410b;
    public final yv0 f35411c;
    public final xv0 d;
    public final aw0 e;

    public zv0(aw0 aw0Var, Context context, int i10) {
        this.e = aw0Var;
        this.f35410b = i10;
        int i11 = aw0Var.f26671l2;
        aw0Var.f26671l2 = i11 + 1;
        this.f35409a = (i11 & 65535) | 65536;
        this.f35411c = new yv0(this, context, i10);
        this.d = new xv0(aw0Var, context, i10, false);
    }
}
