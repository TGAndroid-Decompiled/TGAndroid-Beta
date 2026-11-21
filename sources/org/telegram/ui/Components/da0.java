package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class da0 extends b71 {
    public final Context f34466a;
    public final wa0 f34467b;

    public da0(wa0 wa0Var, Context context) {
        this.f34467b = wa0Var;
        this.f34466a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        qa0 qa0Var = (qa0) view;
        qa0Var.i();
        qa0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new qa0(this.f34467b, this.f34466a, i7);
    }

    @Override
    public final int e() {
        return this.f34467b.f41746e.f40314a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ta0) this.f34467b.f41746e.f40314a.get(i7)).f39816a;
    }
}
