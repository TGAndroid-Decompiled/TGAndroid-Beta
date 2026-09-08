package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final i4 f36242a;
    public final String f36243b;
    public final boolean[] f36244c;
    public final of.e d;

    public f0(i4 i4Var, String str, boolean[] zArr, of.e eVar) {
        this.f36242a = i4Var;
        this.f36243b = str;
        this.f36244c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f36243b;
        if (!of.f.f(Uri.parse(str), false, this.f36244c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f36242a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f17032c = new org.telegram.ui.ActionBar.c6(4, i4Var, eVar);
        } else {
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.dismiss(true);
            }
        }
        of.f.r(i4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
