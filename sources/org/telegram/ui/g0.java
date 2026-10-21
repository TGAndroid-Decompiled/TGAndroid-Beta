package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final l4 f37151a;
    public final String f37152b;
    public final boolean[] f37153c;
    public final pf.c d;

    public g0(l4 l4Var, String str, boolean[] zArr, pf.c cVar) {
        this.f37151a = l4Var;
        this.f37152b = str;
        this.f37153c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f37152b;
        if (!pf.d.e(Uri.parse(str), false, this.f37153c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.f37151a;
        pf.c cVar = this.d;
        if (cVar != null) {
            cVar.f44291c = new i0(0, l4Var, cVar);
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
