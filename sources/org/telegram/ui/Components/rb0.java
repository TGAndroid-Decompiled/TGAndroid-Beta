package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rb0 extends u81 {
    public final Context f29912a;
    public final oc0 f29913b;

    public rb0(oc0 oc0Var, Context context) {
        this.f29913b = oc0Var;
        this.f29912a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ic0 ic0Var = (ic0) view;
        ic0Var.i();
        ic0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new ic0(this.f29913b, this.f29912a, i10);
    }

    @Override
    public final int e() {
        return this.f29913b.e.f28497a.size();
    }

    @Override
    public final int h(int i10) {
        return ((lc0) this.f29913b.e.f28497a.get(i10)).f28196a;
    }
}
