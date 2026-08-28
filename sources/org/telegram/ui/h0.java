package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class h0 implements Utilities.Callback0Return {
    public final l4 f38634a;
    public final String f38635b;
    public final boolean[] f38636c;
    public final ve.d d;

    public h0(l4 l4Var, String str, boolean[] zArr, ve.d dVar) {
        this.f38634a = l4Var;
        this.f38635b = str;
        this.f38636c = zArr;
        this.d = dVar;
    }

    @Override
    public final Object run() {
        String str = this.f38635b;
        if (!ve.e.f(Uri.parse(str), false, this.f38636c)) {
            return Boolean.FALSE;
        }
        l4 l4Var = this.f38634a;
        ve.d dVar = this.d;
        if (dVar != null) {
            dVar.f48383c = new org.telegram.messenger.voip.l0(10, l4Var, dVar);
        } else {
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.dismiss(true);
            }
        }
        ve.e.r(l4Var.H, Uri.parse(str), true, true, false, dVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
