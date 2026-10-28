package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qb0 extends n91 {
    public final Context f31852a;
    public final oc0 f31853b;

    public qb0(oc0 oc0Var, Context context) {
        this.f31853b = oc0Var;
        this.f31852a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ic0 ic0Var = (ic0) view;
        ic0Var.i();
        ic0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new ic0(this.f31853b, this.f31852a, i10);
    }

    @Override
    public final int e() {
        return this.f31853b.e.f30495a.size();
    }

    @Override
    public final int h(int i10) {
        return ((lc0) this.f31853b.e.f30495a.get(i10)).f30227a;
    }
}
