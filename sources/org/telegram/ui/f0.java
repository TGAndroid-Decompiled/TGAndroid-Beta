package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f33451a;
    public final String f33452b;
    public final boolean[] f33453c;
    public final nf.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33451a = h4Var;
        this.f33452b = str;
        this.f33453c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33452b;
        if (!nf.f.f(Uri.parse(str), false, this.f33453c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f33451a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15443c = new org.telegram.ui.ActionBar.c6(4, h4Var, eVar);
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
