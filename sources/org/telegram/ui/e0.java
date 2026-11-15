package org.telegram.ui;

import android.net.Uri;
public final class e0 implements org.telegram.messenger.r10 {
    public final g4 f46501a;
    public final String f46502b;
    public final boolean[] f46503c;
    public final vf.b d;

    public e0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f46501a = g4Var;
        this.f46502b = str;
        this.f46503c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f46502b;
        if (!vf.c.g(Uri.parse(str), false, this.f46503c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f46501a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f58806c = new oi.u4(25, g4Var, bVar);
        } else {
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.a(true);
            }
        }
        vf.c.s(g4Var.M, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
