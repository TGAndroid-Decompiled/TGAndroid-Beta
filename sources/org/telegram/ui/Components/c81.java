package org.telegram.ui.Components;

import android.content.Context;
public final class c81 extends i2.k {
    public final i81 d;

    public c81(Context context, i81 i81Var) {
        super(context);
        this.d = i81Var;
    }

    @Override
    public final k2.s0 a(Context context) {
        bi.p5 p5Var = new bi.p5(context);
        p5Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new h81(this.d))});
        return p5Var.a();
    }
}
