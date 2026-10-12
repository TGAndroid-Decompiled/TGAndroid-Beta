package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final k4 f36264a;
    public final String f36265b;
    public final boolean[] f36266c;
    public final pf.c d;

    public g0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f36264a = k4Var;
        this.f36265b = str;
        this.f36266c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f36265b;
        if (!pf.d.f(Uri.parse(str), false, this.f36266c)) {
            return Boolean.FALSE;
        }
        k4 k4Var = this.f36264a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f43198c = new org.telegram.messenger.voip.j(16, k4Var, cVar);
        } else {
            x3 x3Var = k4Var.K;
            if (x3Var != null) {
                x3Var.dismiss(true);
            }
        }
        pf.d.r(k4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
