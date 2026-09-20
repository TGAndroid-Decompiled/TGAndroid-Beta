package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f33426a;
    public final String f33427b;
    public final boolean[] f33428c;
    public final nf.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33426a = h4Var;
        this.f33427b = str;
        this.f33428c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33427b;
        if (!nf.f.f(Uri.parse(str), false, this.f33428c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f33426a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15430c = new org.telegram.ui.ActionBar.c6(4, h4Var, eVar);
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
