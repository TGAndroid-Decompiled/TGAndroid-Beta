package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class h0 implements Utilities.Callback0Return {
    public final l4 f37189a;
    public final String f37190b;
    public final boolean[] f37191c;
    public final af.f d;

    public h0(l4 l4Var, String str, boolean[] zArr, af.f fVar) {
        this.f37189a = l4Var;
        this.f37190b = str;
        this.f37191c = zArr;
        this.d = fVar;
    }

    @Override
    public final Object run() {
        String str = this.f37190b;
        if (!af.g.f(Uri.parse(str), false, this.f37191c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.f37189a;
        af.f fVar = this.d;
        if (fVar != null) {
            fVar.f181c = new org.telegram.messenger.voip.h(14, l4Var, fVar);
        } else {
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.dismiss(true);
            }
        }
        af.g.r(l4Var.I, Uri.parse(str), true, true, false, fVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
