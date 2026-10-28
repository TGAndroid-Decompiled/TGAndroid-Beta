package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class f0 implements Utilities.Callback0Return {
    public final j4 f39116a;
    public final String f39117b;
    public final boolean[] f39118c;
    public final qf.c d;

    public f0(j4 j4Var, String str, boolean[] zArr, qf.c cVar) {
        this.f39116a = j4Var;
        this.f39117b = str;
        this.f39118c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f39117b;
        if (!qf.d.e(Uri.parse(str), false, this.f39118c)) {
            return Boolean.FALSE;
        }
        j4 j4Var = this.f39116a;
        qf.c cVar = this.d;
        if (cVar != null) {
            cVar.f47070c = new org.telegram.messenger.voip.m0(11, j4Var, cVar);
        } else {
            v3 v3Var = j4Var.K;
            if (v3Var != null) {
                v3Var.dismiss(true);
            }
        }
        qf.d.q(j4Var.L, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
