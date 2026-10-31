package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class cu0 extends org.telegram.ui.Components.sk0 {
    public final Context f36552c;
    public final du0 d;

    public cu0(du0 du0Var, Context context) {
        this.d = du0Var;
        this.f36552c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((fu0) this.d.f36836n.d.get(c1Var.b())).f37348a.current;
    }

    @Override
    public final int b() {
        return this.d.f36836n.d.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        kg.a2 a2Var = (kg.a2) c1Var.f47898a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f36836n;
        fu0 fu0Var = (fu0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != b() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        a2Var.a(fu0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        a2Var.c(z11, false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        bu0 bu0Var = new bu0(this, this.f36552c);
        bu0Var.setCirclePaintProvider(new ep0(6, this, bu0Var));
        return new s4.c1(bu0Var);
    }
}
