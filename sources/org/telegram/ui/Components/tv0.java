package org.telegram.ui.Components;

import android.content.Context;
public final class tv0 {
    public final int f30684a;
    public final int f30685b;
    public final sv0 f30686c;
    public final rv0 d;
    public final uv0 e;

    public tv0(uv0 uv0Var, Context context, int i10) {
        this.e = uv0Var;
        this.f30685b = i10;
        int i11 = uv0Var.a2;
        uv0Var.a2 = i11 + 1;
        this.f30684a = (i11 & 65535) | 65536;
        this.f30686c = new sv0(this, context, i10);
        this.d = new rv0(uv0Var, context, i10, false);
    }
}
