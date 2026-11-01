package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class bu0 extends org.telegram.ui.Components.tk0 {
    public final Context f36116c;
    public final cu0 d;

    public bu0(cu0 cu0Var, Context context) {
        this.d = cu0Var;
        this.f36116c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((eu0) this.d.f36413n.d.get(c1Var.b())).f36910a.current;
    }

    @Override
    public final int b() {
        return this.d.f36413n.d.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        kg.a2 a2Var = (kg.a2) c1Var.f47909a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f36413n;
        eu0 eu0Var = (eu0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        a2Var.a(eu0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        a2Var.c(z11, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        au0 au0Var = new au0(this, this.f36116c);
        au0Var.setCirclePaintProvider(new cp0(6, this, au0Var));
        return new s4.c1(au0Var);
    }
}
