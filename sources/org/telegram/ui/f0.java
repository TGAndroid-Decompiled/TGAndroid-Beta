package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final h4 f37493a;
    public final String f37494b;
    public final boolean[] f37495c;
    public final of.e d;

    public f0(h4 h4Var, String str, boolean[] zArr, of.e eVar) {
        this.f37493a = h4Var;
        this.f37494b = str;
        this.f37495c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37494b;
        if (!of.f.f(Uri.parse(str), false, this.f37495c)) {
            return Boolean.FALSE;
        }
        h4 h4Var = this.f37493a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f17169c = new org.telegram.ui.ActionBar.a6(4, h4Var, eVar);
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
