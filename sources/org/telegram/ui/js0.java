package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class js0 extends org.telegram.ui.Components.sj0 {
    public final Context f46685c;
    public final ks0 d;

    public js0(ks0 ks0Var, Context context) {
        this.d = ks0Var;
        this.f46685c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return !((ms0) this.d.f47012n.d.get(d1Var.b())).f47776a.current;
    }

    @Override
    public final int b() {
        return this.d.f47012n.d.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        vg.n1 n1Var = (vg.n1) d1Var.f55540a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f47012n;
        ms0 ms0Var = (ms0) premiumPreviewFragment.d.get(i3);
        boolean z11 = true;
        if (i3 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.a(ms0Var, z10);
        if (premiumPreviewFragment.f41639e != i3) {
            z11 = false;
        }
        n1Var.c(z11, false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        is0 is0Var = new is0(this, this.f46685c);
        is0Var.setCirclePaintProvider(new rb0(15, this, is0Var));
        return new u4.d1(is0Var);
    }
}
