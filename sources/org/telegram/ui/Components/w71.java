package org.telegram.ui.Components;

import android.content.Context;
public final class w71 extends i2.l {
    public final c81 d;

    public w71(Context context, c81 c81Var) {
        super(context);
        this.d = c81Var;
    }

    @Override
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context, 1);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new b81(this.d))});
        return p4Var.a();
    }
}
