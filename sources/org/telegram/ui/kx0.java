package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class kx0 extends org.telegram.ui.Components.ul0 {
    public final Context f34471c;
    public final lx0 d;

    public kx0(lx0 lx0Var, Context context) {
        this.d = lx0Var;
        this.f34471c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((nx0) this.d.f34805n.d.get(c1Var.b())).f35352a.current;
    }

    @Override
    public final int h() {
        return this.d.f34805n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        qg.r1 r1Var = (qg.r1) c1Var.f41610a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f34805n;
        nx0 nx0Var = (nx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(nx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jx0 jx0Var = new jx0(this, this.f34471c);
        jx0Var.setCirclePaintProvider(new l80(27, this, jx0Var));
        return new s4.c1(jx0Var);
    }
}
