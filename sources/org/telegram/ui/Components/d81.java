package org.telegram.ui.Components;

import android.content.Context;
public final class d81 extends i2.k {
    public final j81 d;

    public d81(Context context, j81 j81Var) {
        super(context);
        this.d = j81Var;
    }

    @Override
    public final k2.t0 a(Context context) {
        ci.o4 o4Var = new ci.o4(context, 1);
        o4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new i81(this.d))});
        return o4Var.a();
    }
}
