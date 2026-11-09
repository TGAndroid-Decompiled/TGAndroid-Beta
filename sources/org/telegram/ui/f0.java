package org.telegram.ui;

import android.net.Uri;
public final class f0 implements org.telegram.messenger.u10 {
    public final g4 f45546a;
    public final String f45547b;
    public final boolean[] f45548c;
    public final vf.b d;

    public f0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f45546a = g4Var;
        this.f45547b = str;
        this.f45548c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f45547b;
        if (!vf.c.g(Uri.parse(str), false, this.f45548c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f45546a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f57337c = new org.telegram.ui.ActionBar.p(6, g4Var, bVar);
        } else {
            t3 t3Var = g4Var.K;
            if (t3Var != null) {
                t3Var.a(true);
            }
        }
        vf.c.s(g4Var.L, Uri.parse(str), true, true, false, bVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
