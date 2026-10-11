package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class hx0 extends org.telegram.ui.Components.rm0 {
    public final Context f38528c;
    public final ix0 d;

    public hx0(ix0 ix0Var, Context context) {
        this.d = ix0Var;
        this.f38528c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return !((kx0) this.d.f38799n.d.get(d1Var.b())).f39438a.current;
    }

    @Override
    public final int h() {
        return this.d.f38799n.d.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        rg.q1 q1Var = (rg.q1) d1Var.f47748a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f38799n;
        kx0 kx0Var = (kx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        q1Var.a(kx0Var, z10);
        if (premiumPreviewFragment.f34160e != i10) {
            z11 = false;
        }
        q1Var.c(z11, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        gx0 gx0Var = new gx0(this, this.f38528c);
        gx0Var.setCirclePaintProvider(new js0(4, this, gx0Var));
        return new s4.d1(gx0Var);
    }
}
