package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class kx0 extends org.telegram.ui.Components.ll0 {
    public final Context f35379c;
    public final lx0 d;

    public kx0(lx0 lx0Var, Context context) {
        this.d = lx0Var;
        this.f35379c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((nx0) this.d.f35652n.d.get(c1Var.b())).f36175a.current;
    }

    @Override
    public final int h() {
        return this.d.f35652n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.p1 p1Var = (rg.p1) c1Var.f42702a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f35652n;
        nx0 nx0Var = (nx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(nx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jx0 jx0Var = new jx0(this, this.f35379c);
        jx0Var.setCirclePaintProvider(new tv0(1, this, jx0Var));
        return new s4.c1(jx0Var);
    }
}
