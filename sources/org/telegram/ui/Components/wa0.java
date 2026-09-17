package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class wa0 extends b81 {
    public final Context f29620a;
    public final vb0 f29621b;

    public wa0(vb0 vb0Var, Context context) {
        this.f29621b = vb0Var;
        this.f29620a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pb0 pb0Var = (pb0) view;
        pb0Var.h();
        pb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pb0(this.f29621b, this.f29620a, i10);
    }

    @Override
    public final int e() {
        return this.f29621b.e.f28053a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sb0) this.f29621b.e.f28053a.get(i10)).f27828a;
    }
}
