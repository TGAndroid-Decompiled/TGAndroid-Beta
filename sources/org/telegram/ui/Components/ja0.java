package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

public final class ja0 extends g71 {

    public final Context f29660a;

    public final gb0 f29661b;

    public ja0(gb0 gb0Var, Context context) {
        this.f29661b = gb0Var;
        this.f29660a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ab0 ab0Var = (ab0) view;
        ab0Var.h();
        ab0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new ab0(this.f29661b, this.f29660a, i10);
    }

    @Override
    public final int e() {
        return this.f29661b.f28583e.f28004a.size();
    }

    @Override
    public final int h(int i10) {
        return ((db0) this.f29661b.f28583e.f28004a.get(i10)).f27703a;
    }
}
