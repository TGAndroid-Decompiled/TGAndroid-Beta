package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f37730a;
    public final String f37731b;
    public final boolean[] f37732c;
    public final of.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, of.e eVar) {
        this.f37730a = i4Var;
        this.f37731b = str;
        this.f37732c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37731b;
        if (!of.f.f(Uri.parse(str), false, this.f37732c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f37730a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f17119c = new org.telegram.ui.ActionBar.p(5, i4Var, eVar);
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
