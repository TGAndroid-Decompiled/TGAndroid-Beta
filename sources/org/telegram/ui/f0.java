package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final k4 f37181a;
    public final String f37182b;
    public final boolean[] f37183c;
    public final pf.c d;

    public f0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f37181a = k4Var;
        this.f37182b = str;
        this.f37183c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f37182b;
        if (!pf.d.e(Uri.parse(str), false, this.f37183c)) {
            return Boolean.FALSE;
        }
        k4 k4Var = this.f37181a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f44708c = new h0(0, k4Var, cVar);
        } else {
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.dismiss(true);
            }
        }
        pf.d.q(k4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
