package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f36465a;
    public final String f36466b;
    public final boolean[] f36467c;
    public final nf.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f36465a = i4Var;
        this.f36466b = str;
        this.f36467c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f36466b;
        if (!nf.f.f(Uri.parse(str), false, this.f36467c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f36465a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f16887c = new org.telegram.ui.ActionBar.g6(2, i4Var, eVar);
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
