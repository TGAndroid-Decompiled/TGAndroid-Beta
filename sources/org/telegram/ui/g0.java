package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class g0 implements Utilities.Callback0Return {
    public final j4 f32951a;
    public final String f32952b;
    public final boolean[] f32953c;
    public final nf.e d;

    public g0(j4 j4Var, String str, boolean[] zArr, nf.e eVar) {
        this.f32951a = j4Var;
        this.f32952b = str;
        this.f32953c = zArr;
        this.d = eVar;
    }

    @Override
    public final Object run() {
        String str = this.f32952b;
        if (!nf.f.f(Uri.parse(str), false, this.f32953c)) {
            return Boolean.FALSE;
        }
        j4 j4Var = this.f32951a;
        nf.e eVar = this.d;
        if (eVar != null) {
            eVar.f14041c = new n(1, j4Var, eVar);
        } else {
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.dismiss(true);
            }
        }
        nf.f.r(j4Var.L, Uri.parse(str), true, true, false, eVar, null, true, true, false);
        return Boolean.TRUE;
    }
}
