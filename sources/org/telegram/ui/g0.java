package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final i4 f36452a;
    public final String f36453b;
    public final boolean[] f36454c;
    public final nf.e d;

    public g0(i4 i4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f36452a = i4Var;
        this.f36453b = str;
        this.f36454c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f36453b;
        if (!nf.f.f(Uri.parse(str), false, this.f36454c)) {
            return Boolean.FALSE;
        }
        i4 i4Var = this.f36452a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f16878c = new org.telegram.ui.ActionBar.g6(2, i4Var, eVar);
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
