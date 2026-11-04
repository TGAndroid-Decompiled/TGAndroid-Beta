package org.telegram.ui.Components;

import android.view.View;
public final class gl0 implements View.OnClickListener {
    public final ci.r4 f34150a;

    public gl0(ci.r4 r4Var) {
        this.f34150a = r4Var;
    }

    @Override
    public final void onClick(View view) {
        hl0 hl0Var = (hl0) this.f34150a.d;
        for (int i3 = 0; i3 < hl0Var.f34445e.size(); i3++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) hl0Var.f34445e.get(i3);
            if (hl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).f(ziVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.f22829t0).f21919a).X(ziVar.F0(), ziVar, 0, 0);
                org.telegram.messenger.z5.q(hl0Var.d).y();
            }
        }
        hl0Var.d(true);
    }
}
