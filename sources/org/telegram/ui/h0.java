package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class h0 implements Utilities.Callback0Return {
    public final j4 f34085a;
    public final String f34086b;
    public final boolean[] f34087c;
    public final nf.e d;

    public h0(j4 j4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f34085a = j4Var;
        this.f34086b = str;
        this.f34087c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f34086b;
        if (!nf.f.f(Uri.parse(str), false, this.f34087c)) {
            return Boolean.FALSE;
        }
        j4 j4Var = this.f34085a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f15473c = new n(1, j4Var, eVar);
        } else {
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.dismiss(true);
            }
        }
        nf.f.r(j4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
