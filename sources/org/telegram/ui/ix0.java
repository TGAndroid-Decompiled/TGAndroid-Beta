package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ix0 extends org.telegram.ui.Components.ul0 {
    public final Context f34696c;
    public final jx0 d;

    public ix0(jx0 jx0Var, Context context) {
        this.d = jx0Var;
        this.f34696c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((lx0) this.d.f35004n.d.get(c1Var.b())).f35535a.current;
    }

    @Override
    public final int h() {
        return this.d.f35004n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.p1 p1Var = (rg.p1) c1Var.f42974a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f35004n;
        lx0 lx0Var = (lx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(lx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hx0 hx0Var = new hx0(this, this.f34696c);
        hx0Var.setCirclePaintProvider(new rv0(2, this, hx0Var));
        return new s4.c1(hx0Var);
    }
}
