package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class dw0 extends org.telegram.ui.Components.il0 {
    public final Context f37643c;
    public final ew0 d;

    public dw0(ew0 ew0Var, Context context) {
        this.d = ew0Var;
        this.f37643c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return !((gw0) this.d.f37915n.d.get(n1Var.b())).f38677a.current;
    }

    @Override
    public final int h() {
        return this.d.f37915n.d.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        cg.l2 l2Var = (cg.l2) n1Var.f6432a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f37915n;
        gw0 gw0Var = (gw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l2Var.a(gw0Var, z10);
        if (premiumPreviewFragment.f35912e != i10) {
            z11 = false;
        }
        l2Var.c(z11, false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = new cw0(this, this.f37643c);
        cw0Var.setCirclePaintProvider(new kl0(11, this, cw0Var));
        return new f2.n1(cw0Var);
    }
}
