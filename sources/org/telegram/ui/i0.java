package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i0 implements Utilities.Callback0Return {
    public final m4 f39088a;
    public final String f39089b;
    public final boolean[] f39090c;
    public final ye.c d;

    public i0(m4 m4Var, String str, boolean[] zArr, ye.c cVar) {
        this.f39088a = m4Var;
        this.f39089b = str;
        this.f39090c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f39089b;
        if (!ye.d.f(Uri.parse(str), false, this.f39090c)) {
            return Boolean.FALSE;
        }
        m4 m4Var = this.f39088a;
        ye.c cVar = this.d;
        if (cVar != null) {
            cVar.f50516c = new org.telegram.ui.ActionBar.c(7, m4Var, cVar);
        } else {
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.dismiss(true);
            }
        }
        ye.d.r(m4Var.H, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
