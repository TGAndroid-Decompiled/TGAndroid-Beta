package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final l4 f36998a;
    public final String f36999b;
    public final boolean[] f37000c;
    public final pf.c d;

    public g0(l4 l4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f36998a = l4Var;
        this.f36999b = str;
        this.f37000c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f36999b;
        if (!pf.d.e(Uri.parse(str), false, this.f37000c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.f36998a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f44286c = new i0(0, l4Var, cVar);
        } else {
            x3 x3Var = l4Var.K;
            if (x3Var != null) {
                x3Var.dismiss(true);
            }
        }
        pf.d.q(l4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
