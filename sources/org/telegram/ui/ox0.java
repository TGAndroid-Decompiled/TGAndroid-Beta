package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ox0 extends org.telegram.ui.Components.lm0 {
    public final Context f38766c;
    public final px0 d;

    public ox0(px0 px0Var, Context context) {
        this.d = px0Var;
        this.f38766c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return !((rx0) this.d.f39026n.d.get(b1Var.b())).f39615a.current;
    }

    @Override
    public final int h() {
        return this.d.f39026n.d.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        sg.r1 r1Var = (sg.r1) b1Var.f44838a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f39026n;
        rx0 rx0Var = (rx0) premiumPreviewFragment.d.get(i10);
        boolean z11 = true;
        if (i10 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        r1Var.a(rx0Var, z10);
        if (premiumPreviewFragment.e != i10) {
            z11 = false;
        }
        r1Var.c(z11, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        nx0 nx0Var = new nx0(this, this.f38766c);
        nx0Var.setCirclePaintProvider(new bs0(5, this, nx0Var));
        return new s4.b1(nx0Var);
    }
}
