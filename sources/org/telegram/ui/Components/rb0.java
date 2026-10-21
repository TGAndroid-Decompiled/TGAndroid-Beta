package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rb0 extends w81 {
    public final Context f29914a;
    public final oc0 f29915b;

    public rb0(oc0 oc0Var, Context context) {
        this.f29915b = oc0Var;
        this.f29914a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ic0 ic0Var = (ic0) view;
        ic0Var.i();
        ic0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new ic0(this.f29915b, this.f29914a, i10);
    }

    @Override
    public final int e() {
        return this.f29915b.e.f28481a.size();
    }

    @Override
    public final int h(int i10) {
        return ((lc0) this.f29915b.e.f28481a.get(i10)).f28135a;
    }
}
