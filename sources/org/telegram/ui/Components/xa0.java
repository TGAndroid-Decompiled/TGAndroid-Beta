package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xa0 extends z71 {
    public final Context f29977a;
    public final ub0 f29978b;

    public xa0(ub0 ub0Var, Context context) {
        this.f29978b = ub0Var;
        this.f29977a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ob0 ob0Var = (ob0) view;
        ob0Var.h();
        ob0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new ob0(this.f29978b, this.f29977a, i10);
    }

    @Override
    public final int e() {
        return this.f29978b.e.f27897a.size();
    }

    @Override
    public final int h(int i10) {
        return ((rb0) this.f29978b.e.f27897a.get(i10)).f27597a;
    }
}
