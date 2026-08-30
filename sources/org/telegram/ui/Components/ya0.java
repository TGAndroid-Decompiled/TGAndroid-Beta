package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ya0 extends c81 {
    public final Context f30954a;
    public final wb0 f30955b;

    public ya0(wb0 wb0Var, Context context) {
        this.f30955b = wb0Var;
        this.f30954a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        qb0 qb0Var = (qb0) view;
        qb0Var.h();
        qb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new qb0(this.f30955b, this.f30954a, i10);
    }

    @Override
    public final int e() {
        return this.f30955b.e.f29177a.size();
    }

    @Override
    public final int h(int i10) {
        return ((tb0) this.f30955b.e.f29177a.get(i10)).f28953a;
    }
}
