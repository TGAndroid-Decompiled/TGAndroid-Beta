package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f33433a;
    public final String f33434b;
    public final boolean[] f33435c;
    public final nf.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33433a = h4Var;
        this.f33434b = str;
        this.f33435c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33434b;
        if (!nf.f.f(Uri.parse(str), false, this.f33435c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f33433a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15211c = new m4.g0(28, h4Var, eVar);
        } else {
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.dismiss(true);
            }
        }
        nf.f.r(h4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
