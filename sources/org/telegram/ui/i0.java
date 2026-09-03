package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class i0 implements Utilities.Callback0Return {
    public final n4 f34783a;
    public final String f34784b;
    public final boolean[] f34785c;
    public final ze.c d;

    public i0(n4 n4Var, String str, boolean[] zArr, ze.c cVar) {
        this.f34783a = n4Var;
        this.f34784b = str;
        this.f34785c = zArr;
        this.d = cVar;
    }

    @Override
    public final Object run() {
        String str = this.f34784b;
        if (!ze.d.f(Uri.parse(str), false, this.f34785c)) {
            return Boolean.FALSE;
        }
        n4 n4Var = this.f34783a;
        ze.c cVar = this.d;
        if (cVar != null) {
            cVar.f47469c = new org.telegram.messenger.voip.h(15, n4Var, cVar);
        } else {
            a4 a4Var = n4Var.H;
            if (a4Var != null) {
                a4Var.dismiss(true);
            }
        }
        ze.d.r(n4Var.I, Uri.parse(str), true, true, false, cVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
