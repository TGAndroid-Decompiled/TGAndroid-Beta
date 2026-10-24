package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final k4 f37154a;
    public final String f37155b;
    public final boolean[] f37156c;
    public final pf.c d;

    public f0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f37154a = k4Var;
        this.f37155b = str;
        this.f37156c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f37155b;
        if (!pf.d.e(Uri.parse(str), false, this.f37156c)) {
            return Boolean.FALSE;
        }
        k4 k4Var = this.f37154a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f44707c = new h0(0, k4Var, cVar);
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
