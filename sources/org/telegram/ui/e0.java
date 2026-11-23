package org.telegram.ui;

import android.net.Uri;
public final class e0 implements org.telegram.messenger.q10 {
    public final g4 f47060a;
    public final String f47061b;
    public final boolean[] f47062c;
    public final vf.b d;

    public e0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f47060a = g4Var;
        this.f47061b = str;
        this.f47062c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f47061b;
        if (!vf.c.g(Uri.parse(str), false, this.f47062c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f47060a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f59381c = new oi.s2(21, g4Var, bVar);
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
