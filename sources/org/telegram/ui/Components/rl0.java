package org.telegram.ui.Components;

import android.view.View;
public final class rl0 implements View.OnClickListener {
    public final di.l4 f39278a;

    public rl0(di.l4 l4Var) {
        this.f39278a = l4Var;
    }

    @Override
    public final void onClick(View view) {
        sl0 sl0Var = (sl0) this.f39278a.d;
        for (int i7 = 0; i7 < sl0Var.f39618e.size(); i7++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sl0Var.f39618e.get(i7);
            if (sl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.f24968t0).f23202a).f(gjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.k10.f24968t0).f23202a).W(gjVar.F0(), gjVar, 0, 0);
                org.telegram.messenger.a6.q(sl0Var.d).y();
            }
        }
        sl0Var.d(true);
    }
}
