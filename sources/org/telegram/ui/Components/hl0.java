package org.telegram.ui.Components;

import android.view.View;
public final class hl0 implements View.OnClickListener {
    public final di.i4 f35296a;

    public hl0(di.i4 i4Var) {
        this.f35296a = i4Var;
    }

    @Override
    public final void onClick(View view) {
        il0 il0Var = (il0) this.f35296a.d;
        for (int i7 = 0; i7 < il0Var.f35654e.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) il0Var.f35654e.get(i7);
            if (il0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).f(gjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.f24934t0).f22778a).W(gjVar.F0(), gjVar, 0, 0);
                org.telegram.messenger.z5.q(il0Var.d).y();
            }
        }
        il0Var.d(true);
    }
}
