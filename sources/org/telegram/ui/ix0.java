package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ix0 extends org.telegram.ui.Components.pm0 {
    public final Context f38778c;
    public final jx0 d;

    public ix0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.f38778c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return !((lx0) this.d.f39042n.d.get(d1Var.b())).f39697a.current;
    }

    @Override
    public final int h() {
        return this.d.f39042n.d.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        rg.q1 q1Var = (rg.q1) d1Var.f47658a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f39042n;
        lx0 lx0Var = (lx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.a(lx0Var, z10);
        if (premiumPreviewFragment.f34132e != i10) {
            z11 = false;
        }
        q1Var.c(z11, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        hx0 hx0Var = new hx0(this, this.f38778c);
        hx0Var.setCirclePaintProvider(new ls0(3, this, hx0Var));
        return new s4.d1(hx0Var);
    }
}
