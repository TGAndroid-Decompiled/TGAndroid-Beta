package org.telegram.ui;

import android.net.Uri;
public final class e0 implements org.telegram.messenger.o10 {
    public final g4 f47275a;
    public final String f47276b;
    public final boolean[] f47277c;
    public final vf.b d;

    public e0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f47275a = g4Var;
        this.f47276b = str;
        this.f47277c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f47276b;
        if (!vf.c.g(Uri.parse(str), false, this.f47277c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f47275a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f59503c = new n2.c0(25, g4Var, bVar);
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
