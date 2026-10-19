package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class mw0 extends org.telegram.ui.Components.hm0 {
    public final Context f39358c;
    public final nw0 d;

    public mw0(nw0 nw0Var, Context context) {
        this.d = nw0Var;
        this.f39358c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return !((pw0) this.d.f39695n.d.get(b1Var.b())).f40307a.current;
    }

    @Override
    public final int h() {
        return this.d.f39695n.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        sg.r1 r1Var = (sg.r1) b1Var.f45910a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f39695n;
        pw0 pw0Var = (pw0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(pw0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        lw0 lw0Var = new lw0(this, this.f39358c);
        lw0Var.setCirclePaintProvider(new en0(7, this, lw0Var));
        return new s4.b1(lw0Var);
    }
}
