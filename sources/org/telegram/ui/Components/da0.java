package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class da0 extends b71 {
    public final Context f34424a;
    public final wa0 f34425b;

    public da0(wa0 wa0Var, Context context) {
        this.f34425b = wa0Var;
        this.f34424a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        qa0 qa0Var = (qa0) view;
        qa0Var.i();
        qa0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new qa0(this.f34425b, this.f34424a, i7);
    }

    @Override
    public final int e() {
        return this.f34425b.f41713e.f40289a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ta0) this.f34425b.f41713e.f40289a.get(i7)).f39763a;
    }
}
