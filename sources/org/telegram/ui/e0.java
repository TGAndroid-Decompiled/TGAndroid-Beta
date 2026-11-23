package org.telegram.ui;

import android.net.Uri;
public final class e0 implements org.telegram.messenger.q10 {
    public final g4 f47088a;
    public final String f47089b;
    public final boolean[] f47090c;
    public final vf.b d;

    public e0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f47088a = g4Var;
        this.f47089b = str;
        this.f47090c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f47089b;
        if (!vf.c.g(Uri.parse(str), false, this.f47090c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f47088a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f59418c = new oi.t(23, g4Var, bVar);
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
