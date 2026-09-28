package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f33787a;
    public final String f33788b;
    public final boolean[] f33789c;
    public final nf.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f33787a = i4Var;
        this.f33788b = str;
        this.f33789c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f33788b;
        if (!nf.f.f(Uri.parse(str), false, this.f33789c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f33787a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15438c = new org.telegram.ui.ActionBar.a6(3, i4Var, eVar);
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
