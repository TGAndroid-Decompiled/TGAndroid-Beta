package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f37527a;
    public final String f37528b;
    public final boolean[] f37529c;
    public final of.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, of.e eVar) {
        this.f37527a = h4Var;
        this.f37528b = str;
        this.f37529c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37528b;
        if (!of.f.f(Uri.parse(str), false, this.f37529c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f37527a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f17205c = new org.telegram.ui.ActionBar.a6(4, h4Var, eVar);
        } else {
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.dismiss(true);
            }
        }
        of.f.r(h4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
