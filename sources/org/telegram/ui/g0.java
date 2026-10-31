package org.telegram.ui;

import android.net.Uri;
public final class g0 implements org.telegram.messenger.i20 {
    public final h4 f37371a;
    public final String f37372b;
    public final boolean[] f37373c;
    public final gf.e d;

    public g0(h4 h4Var, String str, boolean[] zArr, gf.e eVar) {
        this.f37371a = h4Var;
        this.f37372b = str;
        this.f37373c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37372b;
        if (!gf.f.e(Uri.parse(str), false, this.f37373c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f37371a;
        gf.e eVar = this.d;
        if (eVar != null) {
            eVar.f7486c = new h0(0, h4Var, eVar);
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
