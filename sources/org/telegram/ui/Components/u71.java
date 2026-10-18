package org.telegram.ui.Components;

import android.content.Context;
public final class u71 extends i2.k {
    public final a81 d;

    public u71(Context context, a81 a81Var) {
        super(context);
        this.d = a81Var;
    }

    @Override
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new z71(this.d))});
        return p4Var.a();
    }
}
