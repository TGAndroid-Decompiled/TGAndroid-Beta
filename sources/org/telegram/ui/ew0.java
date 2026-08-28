package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
public final class ew0 extends org.telegram.ui.Components.vk0 {
    public final Context f38034c;
    public final fw0 d;

    public ew0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.f38034c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return !((hw0) this.d.f38361n.d.get(q1Var.b())).f38943a.current;
    }

    @Override
    public final int h() {
        return this.d.f38361n.d.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        zf.p1 p1Var = (zf.p1) q1Var.f5501a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f38361n;
        hw0 hw0Var = (hw0) premiumPreviewFragment.d.get(i9);
        boolean z11 = true;
        if (i9 != h() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p1Var.a(hw0Var, z10);
        if (premiumPreviewFragment.f35846e != i9) {
            z11 = false;
        }
        p1Var.c(z11, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        dw0 dw0Var = new dw0(this, this.f38034c);
        dw0Var.setCirclePaintProvider(new nl0(11, this, dw0Var));
        return new f2.q1(dw0Var);
    }
}
