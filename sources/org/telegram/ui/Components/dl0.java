package org.telegram.ui.Components;

import android.view.View;
public final class dl0 implements View.OnClickListener {
    public final bi.k5 f33105a;

    public dl0(bi.k5 k5Var) {
        this.f33105a = k5Var;
    }

    @Override
    public final void onClick(View view) {
        el0 el0Var = (el0) this.f33105a.d;
        for (int i7 = 0; i7 < el0Var.f33440e.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) el0Var.f33440e.get(i7);
            if (el0Var.H) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).f(ijVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24470s0).f21765a).W(ijVar.F0(), ijVar, 0, 0);
                org.telegram.messenger.z5.q(el0Var.d).y();
            }
        }
        el0Var.d(true);
    }
}
