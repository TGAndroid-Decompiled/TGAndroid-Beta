package org.telegram.ui.Components;

import android.view.View;
public final class rl0 implements View.OnClickListener {
    public final di.l4 f39349a;

    public rl0(di.l4 l4Var) {
        this.f39349a = l4Var;
    }

    @Override
    public final void onClick(View view) {
        sl0 sl0Var = (sl0) this.f39349a.d;
        for (int i7 = 0; i7 < sl0Var.f39641e.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sl0Var.f39641e.get(i7);
            if (sl0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.f24637t0).f23343a).f(fjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.f24637t0).f23343a).W(fjVar.F0(), fjVar, 0, 0);
                org.telegram.messenger.a6.q(sl0Var.d).y();
            }
        }
        sl0Var.d(true);
    }
}
