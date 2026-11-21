package org.telegram.ui;

import android.net.Uri;
public final class f0 implements org.telegram.messenger.p10 {
    public final g4 f47430a;
    public final String f47431b;
    public final boolean[] f47432c;
    public final vf.b d;

    public f0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f47430a = g4Var;
        this.f47431b = str;
        this.f47432c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f47431b;
        if (!vf.c.g(Uri.parse(str), false, this.f47432c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f47430a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f59414c = new oi.t(23, g4Var, bVar);
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
