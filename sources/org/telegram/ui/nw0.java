package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class nw0 extends org.telegram.ui.Components.rl0 {
    public final Context f36734c;
    public final ow0 d;

    public nw0(ow0 ow0Var, Context context) {
        this.d = ow0Var;
        this.f36734c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return !((qw0) this.d.f36994n.d.get(l1Var.b())).f37853a.current;
    }

    @Override
    public final int h() {
        return this.d.f36994n.d.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        eg.k2 k2Var = (eg.k2) l1Var.f5785a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f36994n;
        qw0 qw0Var = (qw0) premiumPreviewFragment.d.get(i10);
        boolean z10 = true;
        if (i10 != h() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        k2Var.a(qw0Var, z4);
        if (premiumPreviewFragment.e != i10) {
            z10 = false;
        }
        k2Var.c(z10, false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        mw0 mw0Var = new mw0(this, this.f36734c);
        mw0Var.setCirclePaintProvider(new tl0(10, this, mw0Var));
        return new f2.l1(mw0Var);
    }
}
