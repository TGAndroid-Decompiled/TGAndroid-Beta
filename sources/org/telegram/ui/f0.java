package org.telegram.ui;

import android.net.Uri;
public final class f0 implements org.telegram.messenger.u10 {
    public final g4 f45451a;
    public final String f45452b;
    public final boolean[] f45453c;
    public final vf.b d;

    public f0(g4 g4Var, String str, boolean[] zArr, vf.b bVar) {
        this.f45451a = g4Var;
        this.f45452b = str;
        this.f45453c = zArr;
        this.d = bVar;
    }

    @Override
    public final Object run() {
        String str = this.f45452b;
        if (!vf.c.g(Uri.parse(str), false, this.f45453c)) {
            return Boolean.FALSE;
        }
        g4 g4Var = this.f45451a;
        vf.b bVar = this.d;
        if (bVar != null) {
            bVar.f57232c = new org.telegram.ui.ActionBar.p(6, g4Var, bVar);
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
