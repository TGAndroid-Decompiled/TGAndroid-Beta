package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

public final class ew0 extends org.telegram.ui.Components.yk0 {

    public final Context f37868c;
    public final fw0 d;

    public ew0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.f37868c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return !((hw0) this.d.f38219n.d.get(o1Var.b())).f38895a.current;
    }

    @Override
    public final int h() {
        return this.d.f38219n.d.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ag.e3 e3Var = (ag.e3) o1Var.f5789a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.f38219n;
        e3Var.a((hw0) premiumPreviewFragment.d.get(i10), i10 != h() - 1);
        e3Var.c(premiumPreviewFragment.f35849e == i10, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        dw0 dw0Var = new dw0(this, this.f37868c);
        dw0Var.setCirclePaintProvider(new nl0(11, this, dw0Var));
        return new org.telegram.ui.Components.lk0(dw0Var);
    }
}
