package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final l4 f37150a;
    public final String f37151b;
    public final boolean[] f37152c;
    public final pf.c d;

    public g0(l4 l4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f37150a = l4Var;
        this.f37151b = str;
        this.f37152c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f37151b;
        if (!pf.d.e(Uri.parse(str), false, this.f37152c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.f37150a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f44281c = new i0(0, l4Var, cVar);
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
