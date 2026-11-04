package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class k90 extends f61 {
    public final Context f35353a;
    public final da0 f35354b;

    public k90(da0 da0Var, Context context) {
        this.f35354b = da0Var;
        this.f35353a = context;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        x90 x90Var = (x90) view;
        x90Var.i();
        x90Var.l(false);
    }

    @Override
    public final View d(int i3) {
        return new x90(this.f35354b, this.f35353a, i3);
    }

    @Override
    public final int e() {
        return this.f35354b.f33036e.f32143a.size();
    }

    @Override
    public final int h(int i3) {
        return ((aa0) this.f35354b.f33036e.f32143a.get(i3)).f31781a;
    }
}
