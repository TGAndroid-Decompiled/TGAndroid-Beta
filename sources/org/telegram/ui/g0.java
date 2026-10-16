package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final k4 f36030a;
    public final String f36031b;
    public final boolean[] f36032c;
    public final pf.c d;

    public g0(k4 k4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f36030a = k4Var;
        this.f36031b = str;
        this.f36032c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f36031b;
        if (!pf.d.e(Uri.parse(str), false, this.f36032c)) {
            return Boolean.FALSE;
        }
        k4 k4Var = this.f36030a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f42899c = new org.telegram.messenger.voip.p0(11, k4Var, cVar);
        } else {
            x3 x3Var = k4Var.K;
            if (x3Var != null) {
                x3Var.dismiss(true);
            }
        }
        pf.d.q(k4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
