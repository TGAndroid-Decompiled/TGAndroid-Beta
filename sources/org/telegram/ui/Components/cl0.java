package org.telegram.ui.Components;

import android.view.View;
public final class cl0 implements View.OnClickListener {
    public final bi.k5 f32598a;

    public cl0(bi.k5 k5Var) {
        this.f32598a = k5Var;
    }

    @Override
    public final void onClick(View view) {
        dl0 dl0Var = (dl0) this.f32598a.d;
        for (int i7 = 0; i7 < dl0Var.f33030e.size(); i7++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) dl0Var.f33030e.get(i7);
            if (dl0Var.H) {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24467s0).f21729a).f(ijVar.F0());
            } else {
                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24467s0).f21729a).W(ijVar.F0(), ijVar, 0, 0);
                org.telegram.messenger.z5.q(dl0Var.d).y();
            }
        }
        dl0Var.d(true);
    }
}
