package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class cx0 extends org.telegram.ui.Components.yl0 {
    public final Context f35564c;
    public final dx0 d;

    public cx0(dx0 dx0Var, Context context) {
        this.d = dx0Var;
        this.f35564c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((fx0) this.d.f35900n.d.get(c1Var.b())).f36435a.current;
    }

    @Override
    public final int h() {
        return this.d.f35900n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.r1 r1Var = (rg.r1) c1Var.f46538a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f35900n;
        fx0 fx0Var = (fx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(fx0Var, z10);
        if (premiumPreviewFragment.f34142e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bx0 bx0Var = new bx0(this, this.f35564c);
        bx0Var.setCirclePaintProvider(new fs0(4, this, bx0Var));
        return new s4.c1(bx0Var);
    }
}
