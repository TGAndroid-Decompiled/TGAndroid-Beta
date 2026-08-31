package org.telegram.ui.Components;

import android.content.Context;
public final class e71 extends j3.l {
    public final k71 d;

    public e71(Context context, k71 k71Var) {
        super(context);
        this.d = k71Var;
    }

    @Override
    public final l3.k0 a(Context context) {
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(8);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        sVar.f4081b = a2;
        sVar.f4082c = new androidx.biometric.e(new l3.n[]{new l3.t0(new j71(this.d))});
        return new l3.k0(sVar);
    }
}
