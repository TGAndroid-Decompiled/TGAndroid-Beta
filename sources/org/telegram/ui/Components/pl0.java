package org.telegram.ui.Components;

import android.view.View;
public final class pl0 implements View.OnClickListener {
    public final di.l4 f38485a;

    public pl0(di.l4 l4Var) {
        this.f38485a = l4Var;
    }

    @Override
    public final void onClick(View view) {
        ql0 ql0Var = (ql0) this.f38485a.d;
        for (int i7 = 0; i7 < ql0Var.f38830e.size(); i7++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ql0Var.f38830e.get(i7);
            if (ql0Var.I) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24770t0).f23218a).f(fjVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24770t0).f23218a).W(fjVar.F0(), fjVar, 0, 0);
                org.telegram.messenger.a6.q(ql0Var.d).y();
            }
        }
        ql0Var.d(true);
    }
}
