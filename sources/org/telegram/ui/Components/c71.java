package org.telegram.ui.Components;

import android.content.Context;
public final class c71 extends j3.l {
    public final i71 d;

    public c71(Context context, i71 i71Var) {
        super(context);
        this.d = i71Var;
    }

    @Override
    public final l3.k0 a(Context context) {
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(15);
        l3.g a2 = l3.g.a(context);
        a2.getClass();
        rVar.f4029c = a2;
        rVar.d = new androidx.biometric.e(new l3.n[]{new l3.t0(new h71(this.d))});
        return new l3.k0(rVar);
    }
}
