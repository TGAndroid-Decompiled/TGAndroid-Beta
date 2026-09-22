package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f33439a;
    public final String f33440b;
    public final boolean[] f33441c;
    public final nf.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33439a = h4Var;
        this.f33440b = str;
        this.f33441c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33440b;
        if (!nf.f.f(Uri.parse(str), false, this.f33441c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f33439a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15209c = new m4.g0(28, h4Var, eVar);
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
