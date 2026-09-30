package org.telegram.ui.Components;

import android.content.Context;
public final class lv0 {
    public final int f26126a;
    public final int f26127b;
    public final kv0 f26128c;
    public final jv0 d;
    public final mv0 e;

    public lv0(mv0 mv0Var, Context context, int i10) {
        this.e = mv0Var;
        this.f26127b = i10;
        int i11 = mv0Var.a2;
        mv0Var.a2 = i11 + 1;
        this.f26126a = (i11 & 65535) | 65536;
        this.f26128c = new kv0(this, context, i10);
        this.d = new jv0(mv0Var, context, i10, false);
    }
}
