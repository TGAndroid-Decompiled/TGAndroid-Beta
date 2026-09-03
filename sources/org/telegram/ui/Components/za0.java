package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class za0 extends c81 {
    public final Context f31322a;
    public final xb0 f31323b;

    public za0(xb0 xb0Var, Context context) {
        this.f31323b = xb0Var;
        this.f31322a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        rb0 rb0Var = (rb0) view;
        rb0Var.h();
        rb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new rb0(this.f31323b, this.f31322a, i10);
    }

    @Override
    public final int e() {
        return this.f31323b.e.f29447a.size();
    }

    @Override
    public final int h(int i10) {
        return ((ub0) this.f31323b.e.f29447a.get(i10)).f29169a;
    }
}
