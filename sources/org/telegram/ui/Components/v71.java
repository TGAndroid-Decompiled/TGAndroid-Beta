package org.telegram.ui.Components;

import android.content.Context;
public final class v71 extends i2.l {
    public final b81 d;

    public v71(Context context, b81 b81Var) {
        super(context);
        this.d = b81Var;
    }

    @Override
    public final k2.t0 a(Context context) {
        ci.p4 p4Var = new ci.p4(context);
        p4Var.d = new androidx.biometric.e(new c2.n[]{new k2.b1(new a81(this.d))});
        return p4Var.a();
    }
}
