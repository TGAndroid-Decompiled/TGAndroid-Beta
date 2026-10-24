package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class pw0 extends org.telegram.ui.Components.km0 {
    public final Context f40643c;
    public final qw0 d;

    public pw0(qw0 qw0Var, Context context) {
        this.d = qw0Var;
        this.f40643c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return !((sw0) this.d.f40941n.d.get(b1Var.b())).f41816a.current;
    }

    @Override
    public final int h() {
        return this.d.f40941n.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        sg.r1 r1Var = (sg.r1) b1Var.f46342a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f40941n;
        sw0 sw0Var = (sw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(sw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ow0 ow0Var = new ow0(this, this.f40643c);
        ow0Var.setCirclePaintProvider(new pl0(9, this, ow0Var));
        return new s4.b1(ow0Var);
    }
}
