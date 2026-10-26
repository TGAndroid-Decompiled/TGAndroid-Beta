package org.telegram.ui.Components;

import android.content.Context;
public final class zv0 {
    public final int f35412a;
    public final int f35413b;
    public final yv0 f35414c;
    public final xv0 d;
    public final aw0 e;

    public zv0(aw0 aw0Var, Context context, int i10) {
        this.e = aw0Var;
        this.f35413b = i10;
        int i11 = aw0Var.f26673l2;
        aw0Var.f26673l2 = i11 + 1;
        this.f35412a = (i11 & 65535) | 65536;
        this.f35414c = new yv0(this, context, i10);
        this.d = new xv0(aw0Var, context, i10, false);
    }
}
