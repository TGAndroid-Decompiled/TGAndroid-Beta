package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class pw0 extends org.telegram.ui.Components.sl0 {
    public final Context f40169c;
    public final qw0 d;

    public pw0(qw0 qw0Var, Context context) {
        this.d = qw0Var;
        this.f40169c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return !((sw0) this.d.f40712n.d.get(m1Var.b())).f41381a.current;
    }

    @Override
    public final int h() {
        return this.d.f40712n.d.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        fg.j2 j2Var = (fg.j2) m1Var.f5875a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f40712n;
        sw0 sw0Var = (sw0) premiumPreviewFragment.d.get(i10);
        boolean z10 = true;
        if (i10 != h() - 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        j2Var.a(sw0Var, z4);
        if (premiumPreviewFragment.f34487e != i10) {
            z10 = false;
        }
        j2Var.c(z10, false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ow0 ow0Var = new ow0(this, this.f40169c);
        ow0Var.setCirclePaintProvider(new vl0(10, this, ow0Var));
        return new f2.m1(ow0Var);
    }
}
