package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

public final class i0 implements Utilities.Callback0Return {

    public final m4 f38927a;

    public final String f38928b;

    public final boolean[] f38929c;
    public final we.d d;

    public i0(m4 m4Var, String str, boolean[] zArr, we.d dVar) {
        this.f38927a = m4Var;
        this.f38928b = str;
        this.f38929c = zArr;
        this.d = dVar;
    }

    @Override
    public final Object run() {
        String str = this.f38928b;
        if (!we.e.f(Uri.parse(str), false, this.f38929c)) {
            return Boolean.FALSE;
        }
        m4 m4Var = this.f38927a;
        we.d dVar = this.d;
        if (dVar != null) {
            dVar.f49294c = new org.telegram.messenger.voip.l0(10, m4Var, dVar);
        } else {
            z3 z3Var = m4Var.G;
            if (z3Var != null) {
                z3Var.dismiss(true);
            }
        }
        we.e.r(m4Var.H, Uri.parse(str), true, true, false, dVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
