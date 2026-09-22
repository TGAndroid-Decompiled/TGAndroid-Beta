package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wa0 extends a81 {
    public final Context f29676a;
    public final vb0 f29677b;

    public wa0(vb0 vb0Var, Context context) {
        this.f29677b = vb0Var;
        this.f29676a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pb0 pb0Var = (pb0) view;
        pb0Var.h();
        pb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pb0(this.f29677b, this.f29676a, i10);
    }

    @Override
    public final int e() {
        return this.f29677b.e.f28085a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sb0) this.f29677b.e.f28085a.get(i10)).f27821a;
    }
}
