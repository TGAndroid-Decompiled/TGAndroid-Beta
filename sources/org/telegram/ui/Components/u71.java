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
        ci.o4 o4Var = new ci.o4(context);
        o4Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new z71(this.d))});
        return o4Var.a();
    }
}
