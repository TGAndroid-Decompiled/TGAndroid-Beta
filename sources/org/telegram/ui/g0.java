package org.telegram.ui;

import android.net.Uri;
public final class g0 implements org.telegram.messenger.j20 {
    public final h4 f37262a;
    public final String f37263b;
    public final boolean[] f37264c;
    public final gf.e d;

    public g0(h4 h4Var, String str, boolean[] zArr, gf.e eVar) {
        this.f37262a = h4Var;
        this.f37263b = str;
        this.f37264c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37263b;
        if (!gf.f.e(Uri.parse(str), false, this.f37264c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f37262a;
        gf.e eVar = this.d;
        if (eVar != null) {
            eVar.f7487c = new h0(0, h4Var, eVar);
        } else {
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.a(true);
            }
        }
        gf.f.q(h4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
