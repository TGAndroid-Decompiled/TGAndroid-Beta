package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class bx0 extends org.telegram.ui.Components.ll0 {
    public final Context f32194c;
    public final cx0 d;

    public bx0(cx0 cx0Var, Context context) {
        this.d = cx0Var;
        this.f32194c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((ex0) this.d.f32435n.d.get(c1Var.b())).f33032a.current;
    }

    @Override
    public final int h() {
        return this.d.f32435n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.p1 p1Var = (rg.p1) c1Var.f42627a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f32435n;
        ex0 ex0Var = (ex0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(ex0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ax0 ax0Var = new ax0(this, this.f32194c);
        ax0Var.setCirclePaintProvider(new kv0(2, this, ax0Var));
        return new s4.c1(ax0Var);
    }
}
