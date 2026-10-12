package org.telegram.ui.Components;

import android.content.Context;
public final class b81 extends i2.k {
    public final h81 d;

    public b81(Context context, h81 h81Var) {
        super(context);
        this.d = h81Var;
    }

    @Override
    public final k2.s0 a(Context context) {
        bi.p5 p5Var = new bi.p5(context);
        p5Var.d = new androidx.biometric.e(new c2.n[]{new k2.a1(new g81(this.d))});
        return p5Var.a();
    }
}
