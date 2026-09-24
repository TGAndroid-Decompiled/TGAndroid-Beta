package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f33772a;
    public final String f33773b;
    public final boolean[] f33774c;
    public final nf.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33772a = i4Var;
        this.f33773b = str;
        this.f33774c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33773b;
        if (!nf.f.f(Uri.parse(str), false, this.f33774c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f33772a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15423c = new org.telegram.ui.ActionBar.a6(4, i4Var, eVar);
        } else {
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.dismiss(true);
            }
        }
        nf.f.r(i4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
