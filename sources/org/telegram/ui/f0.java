package org.telegram.ui;

import android.net.Uri;
public final class f0 implements org.telegram.messenger.p10 {
    public final g4 f47361a;
    public final String f47362b;
    public final boolean[] f47363c;
    public final vf.b d;

    public f0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f47361a = g4Var;
        this.f47362b = str;
        this.f47363c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f47362b;
        if (!vf.c.g(Uri.parse(str), false, this.f47363c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f47361a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f59376c = new oi.s2(21, g4Var, bVar);
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
