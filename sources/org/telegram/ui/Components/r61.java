package org.telegram.ui.Components;

import android.content.Context;
public final class r61 extends j3.l {
    public final x61 d;

    public r61(Context context, x61 x61Var) {
        super(context);
        this.d = x61Var;
    }

    @Override
    public final l3.k0 a(Context context) {
        androidx.biometric.e eVar = new androidx.biometric.e(29);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        eVar.f1030b = a2;
        eVar.f1031c = new l3.g0(new l3.j[]{new l3.u0(new w61(this.d))});
        return eVar.c();
    }
}
