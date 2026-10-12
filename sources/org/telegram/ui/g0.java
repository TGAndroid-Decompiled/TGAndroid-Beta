package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f37880a;
    public final String f37881b;
    public final boolean[] f37882c;
    public final of.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, of.e eVar) {
        this.f37880a = i4Var;
        this.f37881b = str;
        this.f37882c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f37881b;
        if (!of.f.f(Uri.parse(str), false, this.f37882c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f37880a;
        of.e eVar = this.d;
        if (eVar != null) {
            eVar.f16870c = new org.telegram.ui.ActionBar.f6(2, i4Var, eVar);
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
