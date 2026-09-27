package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class cx0 extends org.telegram.ui.Components.xl0 {
    public final Context f32807c;
    public final dx0 d;

    public cx0(dx0 dx0Var, Context context) {
        this.d = dx0Var;
        this.f32807c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return !((fx0) this.d.f33062n.d.get(c1Var.b())).f33649a.current;
    }

    @Override
    public final int h() {
        return this.d.f33062n.d.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        rg.p1 p1Var = (rg.p1) c1Var.f43005a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f33062n;
        fx0 fx0Var = (fx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(fx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bx0 bx0Var = new bx0(this, this.f32807c);
        bx0Var.setCirclePaintProvider(new gs0(3, this, bx0Var));
        return new s4.c1(bx0Var);
    }
}
