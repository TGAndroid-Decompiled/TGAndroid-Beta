package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f37776a;
    public final String f37777b;
    public final boolean[] f37778c;
    public final of.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, of.e eVar) {
        this.f37776a = i4Var;
        this.f37777b = str;
        this.f37778c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37777b;
        if (!of.f.f(Uri.parse(str), false, this.f37778c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f37776a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f17123c = new org.telegram.ui.ActionBar.p(5, i4Var, eVar);
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
