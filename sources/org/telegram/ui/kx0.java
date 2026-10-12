package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class kx0 extends org.telegram.ui.Components.vm0 {
    public final Context f39593c;
    public final lx0 d;

    public kx0(lx0 lx0Var, Context context) {
        this.d = lx0Var;
        this.f39593c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return !((nx0) this.d.f39869n.d.get(d1Var.b())).f40498a.current;
    }

    @Override
    public final int h() {
        return this.d.f39869n.d.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        rg.q1 q1Var = (rg.q1) d1Var.f47897a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f39869n;
        nx0 nx0Var = (nx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.a(nx0Var, z10);
        if (premiumPreviewFragment.f33971e != i10) {
            z11 = false;
        }
        q1Var.c(z11, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        jx0 jx0Var = new jx0(this, this.f39593c);
        jx0Var.setCirclePaintProvider(new ns0(3, this, jx0Var));
        return new s4.d1(jx0Var);
    }
}
